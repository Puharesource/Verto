# Verto
Verto aims to stop you from ever having to touch OSBot's API,
as well as providing you with a better and more self API, that will try to stop you from writing boilerplate code.

#### Why was Verto made?
When diving into the API for the first time, nothing seems to make sense. Everything seems to have public variables as well
as extending the same class "API.java", leading you to get confused by the amount of suggestions your IDE is giving you.

I myself have never written a script, and due to the way that OSBot is setup, I won't do that until I've written an abstraction
layer that will assist me when writing scripts rather than fight me when writing scripts.

#### Project structure
In the project root, you'll see a folder called "modules", it contains all of the modules that Verto is made up of.
Currently those modules consists of Verto-API and Verto-Main. The API does not contain any of the OSBot API methods and
mainly contains interfaces and constants, that will be mapped, extended and implemented by the Main module. It is then
the Main modules job to control the behaviour of the methods declared by the API.

#### Current node worthy classes, to give you a general view of the project.
As the project is nowhere near being done, here's a few classes that will give you a view of the project.

(API) ThePlayer.java - https://github.com/Puharesource/Verto/blob/master/modules/Verto-API/src/main/java/io/puharesource/osrs/verto/api/entity/player/ThePlayer.java

(Main) VertoEnumMapper.java - https://github.com/Puharesource/Verto/blob/master/modules/Verto-Main/src/main/java/io/puharesource/osrs/verto/VertoEnumMapper.java

#### Why is the project called Verto
Because I suck at coming up with names, and google translate is my friend. (Please suggest a better name, if you can think of one).