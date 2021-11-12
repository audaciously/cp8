midterm 2 review
- know basics of quicksort (which uses recursion w/ a pivot) and recursion (calling method on itself until reaches base case)
- exceptions 
- generics
- collections: lists, stacks, queues, sets, maps, and enum

programming question context - poker (strategies and how shuffling works), how Collections.shuffle() works
- one or two methods, how to rig the shuffling method specifically
- most of code given to us (poker game that works without bias, change it to give winning hands a bit more)
- probabistical approach

- one 50 min programming question, fill in missing code
- zybooks submission ends at 12:22pm
- open book, use any online resources (how to shuffle objects)
- no chatting with human beings

study: poker, zybooks, know how things are added and removed from each collection, how shuffle impacts intial gameplay, old exam,


11/8
GUI programming - more applications of inheritance and aggregation
- graphical user interface
- easy across uses, but implementation can be difficult
- java renders the same way across platforms

GUI packages
import javax.swing.*;

basic elements of GUI
- components (widgets) - buttons, checkboxes, etc
-   containers collect components togther in a single unit
- layout managers - determine how the components are organized on a display
-   if necessary, you can position components without using a layout manager. generally, his solution is used to specify absolute sizes and positions for components

2 kinds of components
abstract windowing toolkit (java.awt)
- designed to use components from platform
- good idea but problematic - have to allow options for all platforms, resulted in heavyweight components
swing (javax.swing)
- components start with J
- only lowest level components are from platform
- lightweight components dont rely on GUI

Container inherits and aggregates from Component

GridLayout or BorderLayout - panels in each area and can move them aound intact

11/12
layout managers
- the configuration of components within a content pane is determined by the layout manager (int the java.awt package)
