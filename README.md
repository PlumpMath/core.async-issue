# core.async-issue

Some simple code to demonstrate a problem compiling projects using ```cljs.core.async``` timeouts targeting NodeJS.

## Usage

Just build with
```
lein cljsbuild once
```

This will build the code using the ```:simple``` and ```:advanced``` compiler optimizations. Then try ```node advanced-issue.js``` and ```node simple-issue.js```. The code compiled is the same, but in the second case we get:

```
    goog.global.setTimeout(a, 0);
                ^
TypeError: Object #<Object> has no method 'setTimeout'
```

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
