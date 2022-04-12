PASOS A SEGUIR:

1) Primero nos aseguramos de tener todas las dependencias necesarias en el POM:
    * Spring Data (JPA/Hibernate)
    * Spring Web
    * Jackson Core (Para los dto y usar json)
    * H2 (o la base de datos con la que decidimos trabajar)
2) Luego vamos al archivo application.properties (que se encuentra en resources) y configuramos nuestra base de datos (
   esto va a depender del tipo de base de datos, en este proyecto está configurado para H2)
3) Empezamos por las entidades porque vamos a hacer un recorrido desde la base de datos hacia el front. Primero mapeamos
   la base de datos y le decimos a nuestro sistema cómo tiene que traducirse a términos que nuestro código pueda
   entender y manejar.
4) Seguimos por los Repositories que extienden de JPA (estamos usando Spring Data, por eso extendemos de esta clase).
   Podríamos agregar métodos específicos si los necesitáramos, pero JPA nos ofrece varios métodos CRUD:
    * findAll();
    * findAll(Sort sort);
    * findAllById(Iterable<ID> ids);
    * saveAll(Iterable<S> entities);
    * flush();
    * saveAndFlush(S entity);
    * saveAllAndFlush(Iterable<S> entities)
5) Una vez que tenemos nuestras interfaces repositories que son las que nos traen los diferentes métodos CRUD necesitamos ir a nuestros Services para empezar a definir nuestros métodos de negocio.
6) Importante → tenemos que usar las anotaciones para ir diciéndole a Spring qué estamos haciendo 
   * Service → @Service
   * Repositories → @Repository
   * Entidades → @Entity
   * y cuando tengamos los controllers → @Controller
7) Agregamos un paso opcional en los services que es hacer una interface por cada clase service para tener más flexibilidad en el sistema. En la interface le declaramos las firmas y en el service las implementamos:

   Interface Service:
   void findById(Long id);

   Clase Service → implementa la interface Service
   void findById(Long id){
   serviceRepository.findById(id);
   }
   


    