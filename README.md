<div align ="center">

# Contamaster *v1.0.0*
    
![logotipo](https://github.com/user-attachments/assets/48df7a9c-8fd4-4ace-9ba3-3129e106ccec)

### *La solución ideal para llevar tu contabilidad al día.*
---------------
</div>
Contamaster es una aplicación de contabilidad desarrollada en Java, diseñada para gestionar la contabilidad de múltiples empresas de manera fácil y organizada. Ofrece una serie de módulos especializados que permiten llevar registros contables precisos y completos, proporcionando una solución integral para pequeñas y medianas empresas que necesitan mantener su contabilidad al día.

Con Contamaster, los usuarios pueden gestionar desde los usuarios del sistema hasta la creación de asientos contables, y generar informes financieros clave como el balance general y los estados financieros. La aplicación está diseñada con una interfaz intuitiva que facilita su uso, permitiendo a los usuarios centrarse en la administración y el análisis financiero.

Características principales:

- **Gestión de Usuarios:** Permite la creación y administración de usuarios con diferentes roles y permisos de acceso.
- **Gestión de Empresas:** Soporte para múltiples empresas, con un perfil contable independiente para cada una.
- **Asientos Contables:** Registro de transacciones contables con control de débitos y créditos.
- **Libro Diario y Libro Mayor:** Generación automática de estos registros contables.
- **Balanza de Comprobación:** Visualización de los saldos de cuentas para verificar el balance de las transacciones.
- **Balance General y Estados Financieros:** Generación de reportes financieros para análisis detallado.

## Tecnologías Utilizadas :building_construction:

<table>
  <tr>
      <td><img src="https://github.com/tandpfun/skill-icons/blob/main/icons/Java-Dark.svg" width="48" title="Java"> </td>
      <td><img src="https://github.com/tandpfun/skill-icons/blob/main//icons/Hibernate-Dark.svg" width="48" title="JPA"></td>
      <td><img src="https://github.com/tandpfun/skill-icons/blob/main/icons/PostgreSQL-Dark.svg" width="48" title="PostgreSQL"></td>
      <td><img src="https://github.com/user-attachments/assets/e87e306f-a1fc-444e-b1d9-fbff39faa236" width="45" height="51" title="Apache NetBeans IDE"></td>
      <td><img src="https://github.com/tandpfun/skill-icons/blob/main/icons/Git.svg" width="48" title="Git"></td>
      <td><img src="https://github.com/tandpfun/skill-icons/blob/main/icons/Github-Dark.svg" width="48" title="Github"></td>
  </tr>
</table>

1. **Java Swing:** Se utilizó para desarrollar la interfaz gráfica del usuario (GUI), permitiendo una experiencia visual intuitiva y amigable en la gestión de los distintos módulos contables.
2. **Java Persistence API (JPA):** Facilita la gestión y persistencia de los datos de la aplicación, haciendo posible el almacenamiento y recuperación de información de manera eficiente. JPA permite mapear objetos Java a una base de datos relacional, asegurando la integridad de los datos.
3. **PostgreSQL:** Base de datos relacional utilizada para almacenar la información contable de múltiples empresas, proporcionando robustez y seguridad en el manejo de datos.
4. **NetBeans:** Entorno de desarrollo integrado (IDE) usado para el desarrollo y la gestión del proyecto. NetBeans facilita la construcción de aplicaciones con Java, permitiendo una administración eficiente de los componentes y librerías del proyecto.![netbeans]
5. **Git:** Sistema de control de versiones que permite rastrear y gestionar los cambios en el código fuente, facilitando un desarrollo estructurado y organizado.
6. **GitHub:** Plataforma para alojar y compartir el repositorio del proyecto, facilitando la colaboración y el seguimiento de versiones del sistema.

## Tabla de Contanidos :pencil:
1. [Requisitos 🖋](#requisitos-)
4. [Descarga 🎯](#descarga-)
5. [Configuración 👨🏽‍💻](#configuración-)
6. [Error de Compilación 📛](#error-de-compilación-)
7. [Desarrolladores 👾](#desarrolladores-)
8. [Licencia 🗒](#licencia-)

## Requisitos 🖋
Para ejecutar y compilar Contamaster, asegúrate de cumplir con los siguientes requisitos:
- Java Development Kit (JDK) 23: Se requiere JDK 23 para compilar el proyecto. Asegúrate de que esté correctamente instalado y configurado en tu sistema.
- Java Runtime Environment (JRE) 23: Necesario para ejecutar la aplicación. Es compatible con la versión del proyecto y garantiza el correcto funcionamiento de todas las funcionalidades.
- Apache NetBeans IDE 23 (o superior): Se recomienda utilizar la versión 23 de NetBeans para una mejor compatibilidad, aunque también puedes utilizar versiones superiores en el futuro. NetBeans facilita el desarrollo y la administración del proyecto, proporcionando herramientas integradas para compilar y ejecutar el código con facilidad.

## Descarga 🎯
Para empezar a trabajar con **Contamaster**, sigue estos pasos para instalar las dependencias y clonar el repositorio:

1. **Instalar Java Development Kit (JDK) 23**  
   Descarga e instala la última versión del JDK 23 desde el siguiente enlace:  
   [Descargar JDK 23](https://download.oracle.com/java/23/latest/jdk-23_windows-x64_bin.exe)

2. **Instalar Apache NetBeans IDE 23**  
   Asegúrate de instalar Apache NetBeans 23 para una mejor compatibilidad con el proyecto. Puedes descargar el instalador desde aquí:  
   [Descargar Apache NetBeans 23](https://dlcdn.apache.org/netbeans/netbeans-installers/23/Apache-NetBeans-23-bin-windows-x64.exe)

3. **Clonar el Repositorio**  
   Con las dependencias instaladas, clona el repositorio de **Contamaster** en tu equipo utilizando Git. Ejecuta el siguiente comando en tu terminal o usa tu herramienta de Git preferida:

   ```bash
   git clone https://github.com/Ever-VC/Contamaster.git
   ```
## Configuración 👨🏽‍💻
Una vez clonado el repositorio de CONTAMASTER, sigue estos pasos para configurar el proyecto y ejecutarlo correctamente en tu entorno local:

1. **Ejecutar el script de creación de base de datos**
   
Lo primero que debes hacer es crear una nueva base de datos con el nombre de ***contamaster***, luego, debes navegar a la carpeta ***database/*** en el directorio del proyecto y ejecuta el archivo consultas.sql en tu nueva base de datos.
Este script creará las tablas necesarias y un usuario administrador por defecto para que el sistema funcione correctamente.

2. **Abrir el prooyecto en Apache NetBeans IDE**

Abres el Apache NetBeans IDE, en la barra superior das click en ***File > Open Project*** buscas la ruta en donde clonaste el proyecto, lo seleccionas y das click en ***Open Project***.

3. **Renombrar el archivo de configuración**
   
Dirígete a la carpeta ***src/META-INF/*** en el proyecto. Allí encontrarás un archivo llamado ***persistence.xml.example***.

![config-img-8](https://github.com/user-attachments/assets/6044df1e-ef8a-4d74-a260-51a7888d0619)

Darás click derecho y luego en ***Properties***.

![config-img-9](https://github.com/user-attachments/assets/2b3c2193-b5b5-49c8-9b7b-3aa548bcb365)

En la sección de ***Extension*** debes eliminar ***example*** y dejar la casilla en limpio.

![config-img-10](https://github.com/user-attachments/assets/ff8e3214-a747-4207-801c-682c4bbddbc2)

Luego das click en ***close***.

![config-img-11](https://github.com/user-attachments/assets/577a63c3-0d9f-4257-b48e-7c7a1e2243c3)

4. **Configurar la contraseña de la base de datos**
   
Abre el archivo persistence.xml (el archivo que acabas de renombrar).

![config-img-12](https://github.com/user-attachments/assets/15e8a67c-426e-4ae5-bc1d-bb97e10f212a)

Dentro del archivo, buscas el apartado de ***javax.persistence.jdbc.password*** y en su atriuto **value** debes cambiar el texto ***your_password*** por la contraseña correspondiente al usuario postgres en tu entorno local.

![config-img-13](https://github.com/user-attachments/assets/a379a955-d73c-49de-b03f-a2bb377f1af0)

> [!NOTE]
> Si el nombre de usuario para acceder a la base de datos es diferente de **postgres**, deberás indicarlo en el apartado de ***javax.persistence.jdbc.user***.

5. **Recompilar el proyecto**
   
Con las configuraciones completas, recompila el proyecto desde tu IDE (NetBeans) para asegurarte de que todos los cambios se integren correctamente. Para ello, debes dar click derecho sobre el nombre del proyecto **(Contamaster)** y luego en **Clean and Build**.

![config-img-14](https://github.com/user-attachments/assets/234a882e-9f2c-45d6-bb37-eb5d296a20d4)

6. **Ejecutar el proyecto**
   
Finalmente, ejecuta Contamaster y verifica que todos los módulos y la conexión a la base de datos funcionen correctamente. Para lograr esto, lo que debes hacer es abrir cualquier JFrame o JPanel (para este caso abriremos el JFrame de Login) y luego, desde la barra superior, dar click en el botón de **Run Project** o bien, precionar la tecla **F6**.

![config-img-15](https://github.com/user-attachments/assets/2e40043c-57bf-4604-96e1-fa9787825669)


Con esto, tu proyecto se debería estar ejecutando sin problemas y mostrarte el formulario de Inicio de Sesión.

![config-img-16](https://github.com/user-attachments/assets/8990f7b7-4a96-4ed2-a8ef-ed80f98e7192)


> [!IMPORTANT]
> Asegúrate de que PostgreSQL esté en funcionamiento y de que la base de datos esté configurada de acuerdo con los requisitos antes de ejecutar la aplicación.

## Error de Compilación 📛

## Desarrolladores 👾
| Nombres                           | Carnet   |
| --------------------------------- | ------- |
| Batres Rivas, Marvin Josué        | BR20028 |
| Hernández Del Cid, Carlos Orlando | HC21027 |
| Retana Medina, Alexander Antolino | RM21077 |
| Vásquez Canales Ever Samuel       | VC21033 |

## Licencia 🗒
