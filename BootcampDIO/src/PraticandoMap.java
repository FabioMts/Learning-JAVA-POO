import java.util.HashMap;
import java.util.Map;

public class PraticandoMap {

	public static void main(String[] args) {

		
		Map<String, String> estadosESiglas = new HashMap<>();
		
		estadosESiglas.put("Acre", "AC");
		estadosESiglas.put("Alagoas", "AL");
		estadosESiglas.put("Amapá", "AP");
		estadosESiglas.put("Amazonas", "AM");
		estadosESiglas.put("Bahia", "BA");
		estadosESiglas.put("Ceara", "CE");
		estadosESiglas.put("Espirito Santo", "ES");
		estadosESiglas.put("Goias", "GO");
		estadosESiglas.put("Maranhão", "MA");
		estadosESiglas.put("Mato Grosso", "MT");
		estadosESiglas.put("Mato Grosso do Sul", "MS");
		estadosESiglas.put("Minas Gerais", "MG");
		estadosESiglas.put("Para", "PA");
		estadosESiglas.put("Paraiba", "PB");
		estadosESiglas.put("Parana", "PR");
		estadosESiglas.put("Pernambuco", "PE");
		estadosESiglas.put("Piaui", "PI");
		estadosESiglas.put("Rio de Janeiro", "RJ");
		estadosESiglas.put("Rio grande do Norte", "RN");
		estadosESiglas.put("Rio grande do Sul", "RS");
		estadosESiglas.put("Rondonia", "RO");
		estadosESiglas.put("Santa Catarina", "SC");
		estadosESiglas.put("São Paulo", "SP");
		estadosESiglas.put("Sergipe", "SE");
		estadosESiglas.put("Tocantins", "TO");

		System.out.println(estadosESiglas);

		estadosESiglas.remove("Minas Gerais");

		System.out.println(estadosESiglas);
		
		estadosESiglas.put("Distrito Federal", "DF");
		
		System.out.println(estadosESiglas.size());
		
		estadosESiglas.remove("Mato Grosso do Sul");
		
		System.out.println(estadosESiglas);
		
		
		for (String estados: estadosESiglas.keySet()) {
			System.out.println(estados + "--" + estadosESiglas.get(estados));
		}

		System.out.println(estadosESiglas.containsValue("SC"));
		System.out.println(estadosESiglas.containsKey("Maranhão"));
	}

}
