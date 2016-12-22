""" A Functional Breakfast """

cheese = 'cheddar'

def mix_and_cook():
    print('Mixing the ingredients')
    print('Greasing the frying pan')
    print('Pouring the mixture into a frying pan')
    print('Cooking the first side')
    print('Flipping it!')
    print('Cooking the other side')

def make_omelette(ingredient):
    cheese = 'James'
    mix_and_cook()
    omelette = 'a {} omelette'.format(cheese)
    return omelette

def make_pancake():
    mix_and_cook()
    pancake = 'a {} pancake'.format(cheese)
    return pancake

def fancy_omelette(*ingredients):
    mix_and_cook()
    omelette = 'a fancy omelette with {} ingredients'.format(len(ingredients))
    return omelette
