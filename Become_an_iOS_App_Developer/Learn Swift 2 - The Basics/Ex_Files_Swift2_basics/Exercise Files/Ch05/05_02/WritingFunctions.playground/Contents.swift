func sayHello(name: String) -> String {
    return "Hello, \(name)"
}

sayHello("Bob")

func customGreeting(name: String, greeting: String) -> String {
    return "\(greeting), \(name)"
}

customGreeting("Bob", greeting: "Hi")

func sayHelloToFullName(firstName: String, _ lastName: String) -> String {
    return "Hello, \(firstName) \(lastName)"
}

sayHelloToFullName("Bob", "Smith")

