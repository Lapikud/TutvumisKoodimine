import requests
import json
import random


"""
This coding example is used to get you familiar with making requests with python

In this example we will be making requests against this site https://jsonplaceholder.typicode.com/
"""


def make_get_request(url):
    r = requests.get(url)
    print(r.text)


if __name__ == '__main__':
    # This will return HTML page of the website
    make_get_request("https://jsonplaceholder.typicode.com/")

    # This will return JSON from posts
    make_get_request("https://jsonplaceholder.typicode.com/posts")

    # This will r
    # return certain post if you specify the id in the url
    make_get_request("https://jsonplaceholder.typicode.com/posts/1")
