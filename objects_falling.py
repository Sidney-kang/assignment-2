# Created by : Sidney Kang
# Created on : 22 Sept. 2017
# Created for : ICS3UR
# Weekly Assignment - Assignment #2
# This program calculates the height of an object dropped from a 100 m cliff  
#   based on the number of seconds that has passed. (inputed by the user)

import ui

def calculate_height_button_touch_up_inside(sender):
    # This calculates the height of the ball

    #constants
    GRAVITY = 9.81
	
    #input
    seconds_passed = float(view['input_of_seconds_passed_since_object_dropped_textbox'].text)

    #process
    height_of_ball = float(100.0 - (1.0/2.0) * (GRAVITY * (seconds_passed * seconds_passed)))
    
    #output
    view['height_above_ground_label'].text = "The height of the ball above ground is: " + str(height_of_ball) + " m."

view = ui.load_view()
view.present('full_screen')
