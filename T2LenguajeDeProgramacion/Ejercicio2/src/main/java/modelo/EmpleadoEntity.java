package modelo;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_empleado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EmpleadoEntity {
	
	@Id
	private String dniEmpleadoString;
	
	@Column(name = "nombre_empleado", nullable = false, length = 45)
	private String nombre_empleado;
	
	@Column(name = "apellido_empleado", nullable = false, length = 45)
	private String apellido_empleado;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha_nacimiento;
	
	@Column(name = "direcccion", nullable = false, length = 45)
	private String direccion;
	
	@Column(name = "correo", nullable = false, length = 45)
	private String correo;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "areaId")
	private AreaEntity areaEntity;

}
