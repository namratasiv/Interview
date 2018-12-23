#!/usr/bin/env python3
# -*- coding: utf-8 -*-
def sentrev(s):
    if len(s) == 0:
        return "";
    words = []
    length = len(s)
    spaces = [' ']
    
    #index tracker
    i=0
    
    #While index is less than length
    while i<length:
        
        if s[i] not in spaces:
            
            word_start = i
            
            while i <length and s[i] not in spaces:
                
                i+=1
                
            words.append(s[word_start:i])
                
        i+=1
    # Join the reversed words   
    return " ".join(reversed(words))

s="He is mine!!!"
print(sentrev(s))