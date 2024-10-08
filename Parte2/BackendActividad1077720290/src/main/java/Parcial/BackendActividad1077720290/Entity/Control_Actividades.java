package Parcial.BackendActividad1077720290.Entity;

import jakarta.persistence.*;


    @Table(name = "Control_Actividades")
    public class Control_Actividades extends ABaseEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "Nombre", length = 20)
        private String Nombre;

        @Column(name = "Fecha", length = 20)
        private String Fecha;

        @Column(name = "Descripcion", length = 20)
        private String Descripcion;

        @Column(name = "Codigo", length = 20)
        private String Codigo;

        @Override
        public Long getId() {
            return id;
        }

        @Override
        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public String getFecha() {
            return Fecha;
        }

        public void setFecha(String fecha) {
            Fecha = fecha;
        }

        public String getDescripcion() {
            return Descripcion;
        }

        public void setDescripcion(String descripcion) {
            Descripcion = descripcion;
        }

        public String getCodigo() {
            return Codigo;
        }

        public void setCodigo(String codigo) {
            Codigo = codigo;
        }
    }

