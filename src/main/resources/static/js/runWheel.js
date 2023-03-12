window.onload = function() {
    let theWheel = new Winwheel({
        'numSegments': 8,     // Specify number of segments.
        'textFontSize': 28,    // Set font size as desired.
        'responsive': true,  // This wheel is responsive!
        'segments':        // Define segments including colour and text.
            [
                {'fillStyle': '#eae56f', 'text': 'Prize 1'},
                {'fillStyle': '#89f26e', 'text': 'Prize 2'},
                {'fillStyle': '#7de6ef', 'text': 'Prize 3'},
                {'fillStyle': '#e7706f', 'text': 'Prize 4'},
                {'fillStyle': '#eae56f', 'text': 'Prize 5'},
                {'fillStyle': '#89f26e', 'text': 'Prize 6'},
                {'fillStyle': '#7de6ef', 'text': 'Prize 7'},
                {'fillStyle': '#e7706f', 'text': 'Prize 8'}
            ],
        'animation':           // Specify the animation to use.
            {
                'type': 'spinToStop',
                'duration': 5,     // Duration in seconds.
                'spins': 8,     // Number of complete spins.
            }
    });

    function startSpin() {
        // Stop any current animation.
        theWheel.stopAnimation(false);
        // Reset the rotation angle to less than or equal to 360 so spinning again
        // works as expected. Setting to modulus (%) 360 keeps the current position.
        theWheel.rotationAngle = theWheel.rotationAngle % 360;

        // Start animation.
        theWheel.startAnimation();

    }
}