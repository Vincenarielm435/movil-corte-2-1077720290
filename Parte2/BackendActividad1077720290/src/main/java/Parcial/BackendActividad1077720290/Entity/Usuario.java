package Parcial.BackendActividad1077720290.Entity;

import jakarta.persistence.*;

@Entity
    @Table(name = "estudiante")
    public class Usuario extends ABaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        @Column(name = "Nombre", length = 20)
        private String Nombre;

        @Column(name = "Apellido", length = 20)
        private String Apellido ;

        @Column(name = "Direccion", length = 20)
        private String Direccion;

        @Column(name = "correo", length = 20)
        private String correo;

        @Column(name = "Telefono", length = 20)
        private String Telefono;

        @Column(name = "Contraseña", length = 20)
        private String Contraseña;

        public String getContraseña() {
            return Contraseña;
        }

        public void setContraseña(String contraseña) {
            Contraseña = contraseña;
        }

        public String getTelefono() {
            return Telefono;
        }

        public void setTelefono(String telefono) {
            Telefono = telefono;
        }

        public String getDireccion() {
            return Direccion;
        }

        public void setDireccion(String direccion) {
            Direccion = direccion;
        }

        public String getApellido() {
            return Apellido;
        }

        public void setApellido(String apellido) {
            Apellido = apellido;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
    }