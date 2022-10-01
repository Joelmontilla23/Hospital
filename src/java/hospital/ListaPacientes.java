package hospital;
import java.util.ArrayList;
public class ListaPacientes {
    Medico Joy1 = new Medico("Joy", "Primera", "Femenino","6");
    Medico Joy2 = new Medico("Joy", "Segunda", "Femenino","12");
    Medico Joy3 = new Medico("Joy", "Tercera", "Femenino","18");
    Medico Joy4 = new Medico("Joy", "Cuarta", "Femenino","24");
    Medico Joy5 = new Medico("Joy", "Quinta", "Femenino","30");
    public String ListaKanto(){
    String lista = "";
    ArrayList<String> nombre = new ArrayList<>();
    ArrayList<String> apellido = new ArrayList<>();
    ArrayList<String> sexo = new ArrayList<>();
    ArrayList<String> codigo = new ArrayList<>();
    ArrayList<String> direccion = new ArrayList<>();
    ArrayList<String> razonAsistencia = new ArrayList<>();
    ArrayList<String> medAtend = new ArrayList<>();
    ArrayList<String> lugAtend = new ArrayList<>();
    ArrayList<String> fecha = new ArrayList<>();
    Paciente Pikachu = new Paciente("Pikachu", "Electrico", "Masculino", "025", "Pueblo Paleta", "Ciudad Verde", "Joy Primera", "Debilitación", "23 de Octubre");

    nombre.add(Pikachu.getNombre()); apellido.add(Pikachu.getApellido()); sexo.add(Pikachu.getSexo()); codigo.add(Pikachu.getCodigo()); direccion.add(Pikachu.getDireccion()); 
    razonAsistencia.add(Pikachu.getRazonAsistencia()); medAtend.add(Pikachu.getMedAtend()); lugAtend.add(Pikachu.getLugAtend()); fecha.add(Pikachu.getFecha());

    Paciente Pidgey = new Paciente("Pidgey", "Volador", "Masculino", "016", "Ruta 2", "Ciudad Plateada", "Joy Segunda", "Paralasis", "14 de noviembre");

    nombre.add(Pidgey.getNombre()); apellido.add(Pidgey.getApellido()); sexo.add(Pidgey.getSexo()); codigo.add(Pidgey.getCodigo()); direccion.add(Pidgey.getDireccion()); 
    razonAsistencia.add(Pidgey.getRazonAsistencia()); medAtend.add(Pidgey.getMedAtend()); lugAtend.add(Pidgey.getLugAtend()); fecha.add(Pidgey.getFecha());

    Paciente Charmander = new Paciente("Charmander", "Fuego", "Masculino", "004", "Ruta 25", "Ciudad Celeste", "Joy Tercera", "Hipotermia", "6 de Diciembre");

    nombre.add(Charmander.getNombre()); apellido.add(Charmander.getApellido()); sexo.add(Charmander.getSexo()); codigo.add(Charmander.getCodigo()); direccion.add(Charmander.getDireccion()); 
    razonAsistencia.add(Charmander.getRazonAsistencia()); medAtend.add(Charmander.getMedAtend()); lugAtend.add(Charmander.getLugAtend()); fecha.add(Charmander.getFecha());

    Paciente Squirtle = new Paciente("Squirtle", "Agua", "Masculino", "007", "Ciudad Carmín", "Ciudad Carmín", "Joy Cuarta", "Envenenamiento", "25 de diciembre");
 
    nombre.add(Squirtle.getNombre()); apellido.add(Squirtle.getApellido()); sexo.add(Squirtle.getSexo()); codigo.add(Squirtle.getCodigo()); direccion.add(Squirtle.getDireccion()); 
    razonAsistencia.add(Squirtle.getRazonAsistencia()); medAtend.add(Squirtle.getMedAtend()); lugAtend.add(Squirtle.getLugAtend()); fecha.add(Squirtle.getFecha());

    Paciente Bulbasaur = new Paciente("Bulbasaur", "Planta", "Masculino", "001", "Ciudad Celeste", "Ciudad Celeste", "Joy Quinta", "Quemaduras", "15 de diciembre");
 
    nombre.add(Bulbasaur.getNombre()); apellido.add(Bulbasaur.getApellido()); sexo.add(Bulbasaur.getSexo()); codigo.add(Bulbasaur.getCodigo()); direccion.add(Bulbasaur.getDireccion()); 
    razonAsistencia.add(Bulbasaur.getRazonAsistencia()); medAtend.add(Bulbasaur.getMedAtend()); lugAtend.add(Bulbasaur.getLugAtend()); fecha.add(Bulbasaur.getFecha());
    

        for (int i = 0; i < nombre.size(); i++) {
         lista = lista +("----//-----//-----//----");
         lista = lista + "<br>";
            int enumerador = i+1;
            lista = lista + enumerador+". "+ "Nombre del paciente: " + nombre.get(i)+"<br>" + 
                          "Apellido del paciente: "+apellido.get(i)+"<br>"+
                          "Sexo: "+sexo.get(i)+ "<br>"+
                          "Código del paciente: "+codigo.get(i)+"<br>"+
                          "Dirección: " + direccion.get(i)+"<br>"+
                          "Centro Médico de Kanto En Que Fue Atendido:"+lugAtend.get(i) +"<br>"+
                          "Medico Que lo Atiende: "+ medAtend.get(i)+"<br>"+
                          "Causa: "+ razonAsistencia.get(i)+"<br>"+
                          "Fecha: "+ fecha.get(i) + "<br>";
          lista = lista +("----//-----//-----//----");
          lista = lista +("<br>");
       }
       
    return lista;    

  }
    public String ListaJohto(){
    String lista = "";
    ArrayList<String> nombre = new ArrayList<>();
    ArrayList<String> apellido = new ArrayList<>();
    ArrayList<String> sexo = new ArrayList<>();
    ArrayList<String> codigo = new ArrayList<>();
    ArrayList<String> direccion = new ArrayList<>();
    ArrayList<String> razonAsistencia = new ArrayList<>();
    ArrayList<String> medAtend = new ArrayList<>();
    ArrayList<String> lugAtend = new ArrayList<>();
    ArrayList<String> fecha = new ArrayList<>();
    Paciente Jolteon = new Paciente("Jolteon", "Electrico", "Masculino", "182J", "Pueblo Primavera", "Ciudad Cerezo", "Joy Primera", "Debilitación", "23 de Octubre");

    nombre.add(Jolteon.getNombre()); apellido.add(Jolteon.getApellido()); sexo.add(Jolteon.getSexo()); codigo.add(Jolteon.getCodigo()); direccion.add(Jolteon.getDireccion()); 
    razonAsistencia.add(Jolteon.getRazonAsistencia()); medAtend.add(Jolteon.getMedAtend()); lugAtend.add(Jolteon.getLugAtend()); fecha.add(Jolteon.getFecha());

    Paciente Noctowl = new Paciente("Noctowl", "Volador", "Masculino", "164N", "Ruta 30", "Ciudad Malva", "Joy Segunda", "Paralasis", "14 de noviembre");

    nombre.add(Noctowl.getNombre()); apellido.add(Noctowl.getApellido()); sexo.add(Noctowl.getSexo()); codigo.add(Noctowl.getCodigo()); direccion.add(Noctowl.getDireccion()); 
    razonAsistencia.add(Noctowl.getRazonAsistencia()); medAtend.add(Noctowl.getMedAtend()); lugAtend.add(Noctowl.getLugAtend()); fecha.add(Noctowl.getFecha());

    Paciente Vulpix = new Paciente("Vulpix", "Fuego", "Masculino", "125J", "Ruinas Alfa", "Ciudad Malva", "Joy Tercera", "Hipotermia", "6 de Diciembre");

    nombre.add(Vulpix.getNombre()); apellido.add(Vulpix.getApellido()); sexo.add(Vulpix.getSexo()); codigo.add(Vulpix.getCodigo()); direccion.add(Vulpix.getDireccion()); 
    razonAsistencia.add(Vulpix.getRazonAsistencia()); medAtend.add(Vulpix.getMedAtend()); lugAtend.add(Vulpix.getLugAtend()); fecha.add(Vulpix.getFecha());

    Paciente Marril = new Paciente("Marril", "Agua", "Masculino", "130J", "Ciudad Iris", "Ciudad Iris", "Joy Cuarta", "Envenenamiento", "25 de diciembre");
 
    nombre.add(Marril.getNombre()); apellido.add(Marril.getApellido()); sexo.add(Marril.getSexo()); codigo.add(Marril.getCodigo()); direccion.add(Marril.getDireccion()); 
    razonAsistencia.add(Marril.getRazonAsistencia()); medAtend.add(Marril.getMedAtend()); lugAtend.add(Marril.getLugAtend()); fecha.add(Marril.getFecha());

    Paciente Tangela = new Paciente("Tangela", "Planta", "Masculino", "179J", "Ruta 34", "Ciudad Trigal", "Joy Quinta", "Quemaduras", "15 de diciembre");
 
    nombre.add(Tangela.getNombre()); apellido.add(Tangela.getApellido()); sexo.add(Tangela.getSexo()); codigo.add(Tangela.getCodigo()); direccion.add(Tangela.getDireccion()); 
    razonAsistencia.add(Tangela.getRazonAsistencia()); medAtend.add(Tangela.getMedAtend()); lugAtend.add(Tangela.getLugAtend()); fecha.add(Tangela.getFecha());
    

        for (int i = 0; i < nombre.size(); i++) {
         lista = lista +("----//-----//-----//----");
         lista = lista + "<br>";
            int enumerador = i+1;
            lista = lista + enumerador+". "+ "Nombre del paciente: " + nombre.get(i)+"<br>" + 
                          "Apellido del paciente: "+apellido.get(i)+"<br>"+
                          "Sexo: "+sexo.get(i)+ "<br>"+
                          "Código del paciente: "+codigo.get(i)+"<br>"+
                          "Dirección: " + direccion.get(i)+"<br>"+
                          "Centro Médico de Kanto En Que Fue Atendido:"+lugAtend.get(i) +"<br>"+
                          "Medico Que lo Atiende: "+ medAtend.get(i)+"<br>"+
                          "Causa: "+ razonAsistencia.get(i)+"<br>"+
                          "Fecha: "+ fecha.get(i) + "<br>";
          lista = lista +("----//-----//-----//----");
          lista = lista +("<br>");
       }
       
    return lista;
    }
}
 
