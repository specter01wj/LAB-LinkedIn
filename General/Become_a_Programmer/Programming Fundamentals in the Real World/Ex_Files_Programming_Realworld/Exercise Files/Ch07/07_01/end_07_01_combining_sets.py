""" Creating and Combining Sets of Friends """

college = set(['Bill', 'Katy', 'Verne', 'Dillon',
               'Bruce', 'Olivia', 'Richard', 'Jim'])

coworker = set(['Aaron', 'Bill', 'Brandon', 'David',
                'Frank', 'Connie', 'Kyle', 'Olivia'])

family = set(['Garry', 'Landon', 'Larry', 'Mark',
              'Olivia', 'Katy', 'Rae', 'Tom'])

# combine all friends into a single set
friends = college.union(coworker, family)

# print out friends in each set
print('I have {} college buddies:'.format(len(college)))
print(college)

print('I have {} coworkers:'.format(len(coworker)))
print(coworker)

print('I have {} family friends:'.format(len(family)))
print(family)

print('I have {} total friends:'.format(len(friends)))
print(friends)
