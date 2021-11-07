node person {
    has name;
    has age;
    has birthday, profession;
}

edge friend: has meeting_place;
edge family: has type;

walker init {
    person1 = spawn here -[friend]-> node::person;
    person2 = spawn here -[family]-> node::person;
    person1.name = "Josh"; person1.age = 32;
    person2.name = "Jane"; person2.age = 30;
    -[friend]->[0].meeting_place = "college";
    -[family]->[0].type = "sister";
    std.out(--> );
}