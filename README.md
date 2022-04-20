# clinicaEnEquipo
Endpoints

Odontólogos (Post/Get) → https://clinica2.herokuapp.com/odontologos 

Odontólogos (Put/GetById/Delete) →  https://clinica2.herokuapp.com/odontologos/{id} 

Pacientes (Post/Get) → https://clinica2.herokuapp.com/pacientes 

Pacientes (Put/GetById/Delete) → https://clinica2.herokuapp.com/pacientes/{id} 

Turnos (Post/Get) → https://clinica2.herokuapp.com/turnos 

Turnos (Put/GetById/Delete) → https://clinica2.herokuapp.com/turnos/{id} 

----------------------------------------------------------------------------------------------------------------------------------------
REQUERIMIENTOS
C13A → Crear entidad pacientes, agregar transacciones y generar excepciones
C13S → Trabajar con Odontólogos
C15S → Clínica dental → gestión de pacientes (alta, buscar, eliminar, modificar)
C17S → Evaluación →  DAO de odontólogos
C18S → Maven → unir Pacientes y Odontólogos
C23S → Spring → Paciente + domicilio + odontólogo
C24A → Spring para unir todo lo visto hasta el momento + turnos
C25S → En esta clase ya se pide tener terminados los AMB (CRUD) para pacientes y para odontólogos. A la clase 25 corresponde hacer buscar pacientes por Id (GET), eliminar pacientes por id (DELETE) y listar todos los pacientes (GET)
C26S →  En esta clase se pide tener terminados los DAO de pacientes y odontólogos y además tener la API de pacientes también terminada. A esta clase corresponde agregar los métodos para los odontólogos: buscar odontólogo por id (GET), registrar un nuevo odontólogo (POST), actualizar los datos de un odontólogo ya registrado (PUT), eliminar un odontólogo (DELETE), y listar todos los odontólogos (GET)
C27S → Teniendo terminado todo lo anterior, corresponde hacer toda la parte de Turnos
C28S → (31/03/22) → Se solicita modificar los datos de un odontólogo ya registrado pero desde la web 
C29S → Probar los cuatro endpoints utilizando postman
C30A → Inyección de dependencias
C30S → CRUD Turnos 
C35S → Refactorización de la capa de persistencia
C37S → BadRequestException
C43S → Login


