/*
 *     Copyright (c) 2015 Andreas Pabst
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package udduk.stroke_coach;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;


public class DrawTextView extends TextView
{
    private StopFragment timeprovider;

    public DrawTextView(Context context)
    {
        super(context);
    }

    public DrawTextView(Context context, AttributeSet attributeSet)
    {
        super(context,attributeSet);
    }

    public DrawTextView(Context context, AttributeSet attributeSet, int defStyleAttr)
    {
        super(context,attributeSet,defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public DrawTextView(Context context, AttributeSet attributeSet, int defStyleAttr, int defStyleRes)
    {
        super(context,attributeSet,defStyleAttr,defStyleRes);
    }

    public void setTimeprovider(StopFragment fragment)
    {
        timeprovider = fragment;
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        setText(timeprovider.getTime());
    }
}
