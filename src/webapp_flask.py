from flask_httpauth import HTTPBasicAuth
from flask import Flask, flash, render_template, request, redirect, url_for, send_from_directory
from flask import request
import logging
from flask import Flask
import argparse
import os
import configparser
import jsonpickle as json
import datetime
#t = datetime.datetime(2012, 2, 23, 0, 0)
#t.strftime('%m/%d/%Y')
import sys
sys.path.append('/'.join(os.getcwd().split("/")[0:-1]))



# Logging Configuration
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

# Flask Configuration
app = Flask(__name__, static_folder=str(os.getcwd()+'/static'))
app.config.from_pyfile('static/config.cfg')

auth = HTTPBasicAuth()
app.secret_key = 'some_secret'

users = {
    "admin": "admin@123"
}

# Flask Routing
@auth.get_password
def get_pw(username):
    if username in users:
        return users.get(username)
    return None


@app.route("/")
@auth.login_required
def login():
    user = auth.username()
    flash('Welcome %s', user)
    return render_template('index.html')


@app.route("/get-timeline", methods=['GET'])
def get_timeline():
    return str(json.dumps(_data))


# Main Function - Start Here
if __name__ == '__main__':
    parser = argparse.ArgumentParser(description='Flask Example: Python Webapp')
    parser.add_argument('-r', help="Run Flask", default=False, action="store_true")
    args = vars(parser.parse_args())
    if args['r']:
        from src.Timeline import _data
        app.run(host='localhost', port=int(app.config['PORT']), debug=True)

