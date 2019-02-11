# Dialog Box Login with Circular Animation
Login Screen on Dialog Box with Circular Animations.

## Demo
![Sample-GIF](Sample/wfG16RSAA5.gif)

The Animation smooth, in the video it seems slow, as to show the animation precisely.
### Prerequisites

This works only for API level 21 and above.

## Circular Animation Code
    private void circularAnimation(View dialogView, final boolean state, final Dialog loginLayout) {

        final View view = dialogView.findViewById(R.id.login_activity);

        int w = view.getWidth();
        int h = view.getHeight();

        final int endRadius = (int) Math.hypot(w, h);

        final int cx = (int) (fab.getX() + (fab.getWidth()/2));
        final int cy = (int) (fab.getY())+ fab.getHeight() + 56;

        // i recommend running animation in view.post(new Runnable()),
        // as couple of times you may get detachable error, this handles that cases
        view.post(new Runnable() {
            @Override
            public void run() {
                if(state){
                    Animator animator = ViewAnimationUtils.createCircularReveal(view, cx,cy, 0, endRadius);

                    view.setVisibility(View.VISIBLE);
                    animator.setDuration(1000);
                    animator.start();

                } else {

                    Animator animator =
                            ViewAnimationUtils.createCircularReveal(view, cx, cy, endRadius, 0);

                    animator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            loginLayout.dismiss();
                            view.setVisibility(View.INVISIBLE);

                        }
                    });
                    animator.setDuration(1000);
                    animator.start();
                }
            }
        });

    }
    
[Circular Reveal Explanation](https://android.jlelse.eu/custom-dialog-with-circular-reveal-animation-ef7dc77ba1e)
