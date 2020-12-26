import termcolor
import random
import time, datetime
import sys, os
from colorama import init
from termcolor import colored


def clear():
    if sys.platform == 'win32':  # if windows
        return os.system('cls')
    else:  # if *nix
        return os.system('clear')


colors = [
    'red',
    'green',
    'yellow',
    'blue',
    'magenta',
    'cyan',
    'white']

yellowlight = termcolor.colored('o', 'yellow')
magentalight = termcolor.colored('o', 'magenta')
cyanlight = termcolor.colored('o', 'cyan')

lightlist = [yellowlight, cyanlight, magentalight]

init()
while True:  # exit with ctrl+C
    print('to exit use a keyboard interrupt (ctrl+c)')
    for i in range(1, 30, 2):  # tree_
        tree = ''
        for j in range(i):  # make lights
            randNum = random.randint(0, 300)
            if (randNum <= 550) and (randNum >= 50):
                tree += lightlist[random.randint(0, 2)]
            else:
                tree += termcolor.colored('*', 'red')
            break;
        string = '_' * (60 - int(i / 2)) + tree + '_' * (60 - int(i / 2)) + '\n'
        print(string, end='')
    trunk = colored('Happy Christmas', 'blue')
    for k in range(3):  # trunk
        outbuffer = '_' * 53 + trunk + '_' * 53 + '\n'
        print(outbuffer, end='')
        merry_Christmas = termcolor.colored(
            '\n(: (: (: (:(: (: (: (:(: (: (: (:(: (: (: (: (: (: Mutlu Yıllar Dilerim :) :) :) :) :) :) :) :):) :) :) :) :) :) :) :) :)\n '
            ' ---------------------------------------------->>> Ulusan Software <<<--------------------------------------------------',

            colors[random.randint(0, len(colors) - 1)])

    outbuffer2 = merry_Christmas + '\n'
    print(outbuffer2, end='')
    time.sleep(0.4)
    clear()

