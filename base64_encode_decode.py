# -*- coding: utf-8 -*-
"""
Created on Thu Sep 13 11:14:11 2018

@author: Kapil Kaushik - github.com/linkwithkk 
"""

import base64

def encoder(inp,opt):
    with open(inp, 'rb') as i:
        data=i.read()
    with open(opt, 'wb') as o:
        o.write(base64.encodebytes(data))
    
def decoder(inp,opt):
    with open(inp, 'rb') as i:
        data=i.read()
    with open(opt, 'wb') as o:
        o.write(base64.decodebytes(data))