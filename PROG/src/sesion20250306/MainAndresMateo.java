package sesion20250306;


interface API {
    String obtenerDatos();
}

class ApiGitHub implements API {
    @Override
   public String obtenerDatos(){
        return "Repositorios de usuario: repo1, repo2, repo3";
    }
}


class ApiClima implements API {
    @Override
    public String obtenerDatos(){
        return "Temperatura actual: 22°C";
    }
}

class ClienteAPI {
    private API api; // si me puede explicar con algun ejemplo porque llama a la interface API

    public ClienteAPI(API api){
        this.api = api;
    }

    public API getAPI(){ // preguntar si el get en este caso seria asi API getAPI o public getAPI
        return api;
    }

    public void setAPI(API api){
        this.api = api;
    }

    public void mostrarDatos(){
        System.out.println("Los datos obtenidos son: "+ api.obtenerDatos());
    }

    // public void mostrarDatos(){
    //     if(api==null){
    //         System.out.println("API no definida.");
    //     } else {
    //         System.out.println("Los datos obtenidos son: "+ api.obtenerDatos());
    //     }
    //
    // }

}


public class MainAndresMateo {

    public static void main(String[] args) {
        ClienteAPI miEjemplo = new ClienteAPI(new ApiGitHub());
        miEjemplo.mostrarDatos();

        miEjemplo.setAPI(new ApiClima()); // puede ser que haya cogido el set porque es la funcion de se utiliza para cambiar  un dato
        miEjemplo.mostrarDatos();
        
    }
}
