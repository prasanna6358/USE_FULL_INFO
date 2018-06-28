https://www.quora.com/What-is-the-difference-between-Hashtable-and-ConcurrentHashMap

Imagine a scenario where we have frequent reads(get) and less writes(put) and need thread safety,

Can we use Hashtable in this scenario?
No. Hashtable is thread safe but give poor performance in case of multiple thread reading from hashtable because all methods of Hashtable including get() method is synchronized and due to which invokation to any method has to wait until any other thread working on hashtable complete its operation(get, put etc).

Method References

Static method reference
In this case, we have a lambda expression like the one below:

(args) -> Class.staticMethod(args)
This can be turned into the following method reference:
Class::staticMethod

(args) -> obj.instanceMethod(args)
This can be turned into the following method reference:

obj::instanceMethod



List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//get list of unique squares
List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

public static void main(){


 System.out.println(filterEmployees(employeeList, isAdultMale()));
        System.out.println(filterEmployees(employeeList, isAduleFeMale()));

       getNum();

    }

    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAduleFeMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("F");
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees.stream().filter(predicate).collect(Collectors.toList());
    }
        
        
        
