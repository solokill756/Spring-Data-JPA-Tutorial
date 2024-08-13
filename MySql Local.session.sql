SELECT *
FROM students;
INSERT INTO students (
        id,
        name,
        address,
        phone,
        sex,
        email,
        password,
        group_id,
        age,
        bank_number
    )
VALUES (
        id :int,
        'name:varchar',
        'address:varchar',
        'phone:varchar',
        sex :int,
        'email:varchar',
        'password:varchar',
        group_id :int,
        age :int,
        'bank_number:varchar'
    );