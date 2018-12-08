# CardView

## Introduction

A card is a sheet of material that serves as an entry point to more detailed information.<br> It is a FrameLayout with a rounded corner background and shadow.<br> Cards may contain a photo, text, and a link about a single subject. They may display content containing elements of varying size, such as photos with captions of variable length. 
![maxresdefault](https://user-images.githubusercontent.com/43182173/49682048-c7cf3600-fa7a-11e8-8f16-4187373ecd08.jpg)<br>
<br>It generally represents a single row item in GridView or ListView. Many famous applications like google music also uses this frame layout. When card is clicked it intents into a new detailed activity. For example when an album tile is clicked in google play music app, a new activity that is music player opens. Hence, CardView can also be used for various other applications to.<br>
<br>
Generally when we want display an image or an icon, also want to write something below it and in all want it function as a button then CardView is the best solution to the situation.<br>
CardView’s appearance as well as performance improves if used with [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview), which is also another useful tool in android development. I can’t explain it here because it will be a complete blog in itself.

## History
It was added in version 25.1.0. There were many issues with this version although none of them was directly related to CardView. These bugs were fixed in version 25.2.0 later on providing complete usage.<br>
<br>
In simple words CardView was first introduced in Android 5.0 (Lollipop platforms). The lollipop acts as a border platform for CardView because some its attributes work inefficiently and some don’t work at all other platforms below it.<br>
<br> However, you must install the Android.Support.v7.CardView package to work below it properly.

## Usage

### Parent ContainerView
Cardview  in itself is a frame layout therefore can be used on its own. But with my personal experience deigning a layout becomes a lot easier if we use Linear or relative layout as its parent.<br>

### Child ContainerView
When I was researching on internet about the usage of Cardview maximum examples which I found were using Linear layout as its first child container view. Personally my recommendation is also same. However relative and constraint layouts can also be used. In my code (which I have uploaded on repository) I have only used Linear Layout.

### Attributes
The attributes of the card view are:<br>
•	cardBackgroundColor : Defines the background color of the card. The default attribute “background” doesn’t have any effect on card.<br> 
•	cardElevation : Defines the elevation. Elevation here refers to how high a card is in relation to the frame layout. The default attribute “elevation” doesn’t have any effect on card.<br>
Elevation further have an attribute which is:
<t>	1) cardMaxElevation : Defines the max elevation. It is a Boolean expression. Hence, it must be set true.<br>

•	cardCornerRadius : Defines the corner radius of the card. More the magnitude more circular will be the corners of the card.
It also further attributes like:
•	contentPadding: Inner padding between the child views of the CardView and all edges of the card.
•	contentPaddingBottom – Inner padding between the child views of the CardView and the bottom edge of the card.
•	contentPaddingLeft – Inner padding between the child views of the CardView and the left edge of the card.
•	contentPaddingRight – Inner padding between the child views of the CardView and the right edge of the card.
•	contentPaddingTop – Inner padding between the child views of the CardView and the top edge of the card.

•	cardPreventCornerOverlap : Enables/disables content padding to prevent children views to be clipped.
•	cardUseCompatPadding : Adds space around the card view to prevent card’s shadow being clipped by the card’s parent view. Personally, I loved this attribute. 


```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
