node person {
    has name;
    has byear;
    can date.quantize_to_year::bday::>byear with setter entry;
    can std.out::byear," from ",visitor.info:: with exit;
}

walker init {
    has year=std.time_now();
    root {
        person1 = spawn here -->
            node::person(name="Josh", byear="1995-01-01");
        take --> ;
    }
    person {
        spawn here walker::setter;
    }
}

walker setter {
    has year=std.time_now();
}