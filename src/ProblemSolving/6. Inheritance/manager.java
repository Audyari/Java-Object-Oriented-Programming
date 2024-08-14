class manager {
    String name;

    void sayHello(String name) {
        System.err.println("Hello" + name + "nama saya " + this.name);
    }

}


class VicePresident extends manager{

    VicePresident(){
        super.sayHello("Panggil cunstruktor ");
    }

    void sayHello(String name){
        System.err.println("HIII "+ this.name);
        super.sayHello(name="Agus");
        
    }
    
}