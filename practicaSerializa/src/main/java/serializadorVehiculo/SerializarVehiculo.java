package serializadorVehiculo;

import com.esotericsoftware.jsonbeans.Json;
import com.esotericsoftware.jsonbeans.JsonSerializer;
import com.esotericsoftware.jsonbeans.JsonValue;

import gestionVehiculos.Vehiculo;

public class SerializarVehiculo implements JsonSerializer<Vehiculo>{

	@Override
	public Vehiculo read(Json json, JsonValue valor, Class type) {
		
		String matricula = valor.getString("matricula");
		String marca = valor.getString("marca");
		String modelo = valor.getString("modelo");
		double deposito = valor.getDouble("deposito");
		
		Vehiculo vehiculo = new Vehiculo (matricula, marca, modelo, deposito);
		
		return vehiculo;
	}

	@Override
	public void write(Json json, Vehiculo vehiculo, Class type) {
		
		json.writeObjectStart();
		json.writeValue("matricula", vehiculo.getMatricula());
		json.writeValue("marca", vehiculo.getMarca());
		json.writeValue("modelo", vehiculo.getModelo());
		json.writeValue("deposito", vehiculo.getDeposito());
		json.writeObjectEnd();
		
	}

}
