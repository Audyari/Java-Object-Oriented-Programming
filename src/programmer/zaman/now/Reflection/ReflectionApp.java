package programmer.zaman.now.Reflection;

public class ReflectionApp {
    public static void main(String[] args) {

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("");
        request.setPassword("");
        request.setName("");

        ValidationUtil.validationReflection(request);

    }
}