#####
#Name: Archer James   04/23/2022
#Purpose: Show understanding of turtle
#Variables: xTurtle,window,jim,halfh,halfw,wTurtle,cTurtle,center,radius,mTurtle,h,i,g,m
#Algorithm: Defined a function to move the turtle using set position and
#coordinates
#Defined a function using a relative positioning to create a 'W'
#Defined a functon to draw a circle using relative positioning anda for statement
#Defined a function using a for statement and relative positioning to move
#the turtle from bottom to top decreasing in size


import turtle

# Lab 18's function definitions goes here

# drawX(xTurtle, window)
def drawX(xTurtle,window):
    '''
This function takes the turtle and draws an 'x'
'''
    jim = xTurtle
    jim.pensize(5)
    jim.fillcolor('pink')
    halfw=window.window_width()/2
    halfh=window.window_height()/2
    jim.setposition((halfw*-1),halfh)
    jim.setposition(halfw,(halfh*-1))
    jim.setposition(0,0)
    jim.setposition(halfw,halfh)
    jim.setposition((halfw*-1),(halfh*-1))
    jim.setposition(0,0)
    
    
    

### drawW(wTurtle, window)
def drawW(wTurtle,window):
    '''
This function draws a 'W'
'''
    jim=wTurtle
    jim.pensize(5)
    jim.fillcolor('red')
    jim.color('blue')
    jim.penup()
    jim.forward(40)
    jim.pendown()
    jim.left(120)
    jim.forward(100)
    jim.right(180)
    jim.forward(100)
    jim.left(120)
    jim.forward(50)
    jim.right(120)
    jim.forward(50)
    jim.left(120)
    jim.forward(100)
# drawCircle(cTurtle, center, radius, window)
import math
def drawCircle(cTurtle, center, radius, window):
    '''
This function draws a circle
'''
    jim=cTurtle
    jim.pensize(5)
    jim.fillcolor('purple')
    jim.color('green')
    jim.penup()
    jim.setposition(center)
    jim.forward(radius)
    jim.pendown()
    distance = ((2.0*math.pi*radius)/120.0)
    for i in range(1,121):
        jim.left(3)
        jim.forward(distance)
    
    
# movingTurtle(mTurtle,window)
def movingTurtle(mTurtle,window):
    '''
This function moves the turtle from the bottom to top getting smaller as it moves
'''
    jim=mTurtle
    jim.shapesize(10)
    jim.pensize(10)
    jim.shape('turtle')
    jim.fillcolor('orange')
    jim.color('orange')
    h = window.window_height()
    bottom=-h//2
    top=h//2
    jim.penup()
    jim.setposition(0,bottom)
    jim.pendown()
    jim.left(90)
    i=10
    g=15
    for m in range(1,top,top//5):
        jim.pensize(g)
        jim.shapesize(i)
        jim.forward(m)
        i-=1
        g-=2

    
    
    
def main():
    # set window size
    width = int(input('Enter the width of the screen: '))
    height = int(input('Enter the height of the screen: '))
    turtle.setup(width,height)
    print('='*50)
    #========================================================
    # get reference to turtle window
    window = turtle.Screen()
    # set window title bar
    window.title('Lab18 - Turtle Object')
    #========================================================
    # Draw X
    Xturtle = turtle.Turtle()
    # function call
    try:
        drawX(Xturtle, window)
    except:
        print('drawX is not either defined or there is a',
              'problem with the function')
    print('='*50)
    #========================================================
    # Draw W
    Wturtle = turtle.Turtle()
    # function call
    try:
        drawW(Wturtle, window)
    except:
        print('drawW is not either defined or there is a',
              'problem with the function')
    print('='*50)
    #========================================================
    # Draw circle
    # Test the function with differen values for center and radius
    circle = turtle.Turtle()

    value = min(width, height)
    center = [[0,0], [value//5, 0], [value//5, value//5]]
    radius = [value//5, value//10, value//2]
    # function call
    for i in range(len(center)):
        try:
            drawCircle(circle, center[i], radius[i], window)
        except:
            print('drawCircle is not either defined or there is a',
                  'problem with the function')

    print('='*50)
    #========================================================    
    # Moving turtle
    mTurtle = turtle.Turtle()
    # function call
    try:
        movingTurtle(mTurtle,window)
    except:
        print('movingTurtle is not either defined or there is a',
              'problem with the function')
    #========================================================

main()
