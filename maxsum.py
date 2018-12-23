#!/usr/bin/env python3
# -*- coding: utf-8 -*-
def maxsum(a):
    if len(a) == 0:
        return 0
    
    max_sum = current_sum = a[0]
    
    for  num in a[1:]:
        
        current_sum = max(current_sum+num, num)
        
        max_sum = max(current_sum, max_sum)
        
    
    return max_sum