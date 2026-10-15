.class public Li/h1;
.super Landroid/widget/TextView;
.source "SourceFile"


# instance fields
.field public final b:Li/r;

.field public final c:Li/e1;

.field public final d:Li/a0;

.field public e:Li/b0;

.field public f:Z

.field public g:Le/n0;

.field public h:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    .line 1
    invoke-direct {p0, p1, p2, v0}, Li/h1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-static {p1}, Li/n3;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Li/h1;->f:Z

    const/4 p1, 0x0

    iput-object p1, p0, Li/h1;->g:Le/n0;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, Li/m3;->a(Landroid/view/View;Landroid/content/Context;)V

    .line 4
    new-instance p1, Li/r;

    invoke-direct {p1, p0}, Li/r;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Li/h1;->b:Li/r;

    .line 5
    invoke-virtual {p1, p2, p3}, Li/r;->e(Landroid/util/AttributeSet;I)V

    .line 6
    new-instance p1, Li/e1;

    invoke-direct {p1, p0}, Li/e1;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Li/h1;->c:Li/e1;

    .line 7
    invoke-virtual {p1, p2, p3}, Li/e1;->f(Landroid/util/AttributeSet;I)V

    .line 8
    invoke-virtual {p1}, Li/e1;->b()V

    .line 9
    new-instance p1, Li/a0;

    invoke-direct {p1, p0}, Li/a0;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Li/h1;->d:Li/a0;

    .line 10
    invoke-direct {p0}, Li/h1;->getEmojiTextViewHelper()Li/b0;

    move-result-object p1

    .line 11
    invoke-virtual {p1, p2, p3}, Li/b0;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic d(Li/h1;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    return-void
.end method

.method public static synthetic e(Li/h1;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setLastBaselineToBottomHeight(I)V

    return-void
.end method

.method public static synthetic f(Li/h1;)[I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Li/h1;)I
    .locals 0

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result p0

    return p0
.end method

.method private getEmojiTextViewHelper()Li/b0;
    .locals 1

    iget-object v0, p0, Li/h1;->e:Li/b0;

    if-nez v0, :cond_0

    new-instance v0, Li/b0;

    invoke-direct {v0, p0}, Li/b0;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Li/h1;->e:Li/b0;

    :cond_0
    iget-object v0, p0, Li/h1;->e:Li/b0;

    return-object v0
.end method

.method public static synthetic h(Li/h1;IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    return-void
.end method

.method public static synthetic i(Li/h1;[II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    return-void
.end method

.method public static synthetic j(Li/h1;I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    return-void
.end method

.method public static synthetic k(Li/h1;Landroid/view/textclassifier/TextClassifier;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->drawableStateChanged()V

    iget-object v0, p0, Li/h1;->b:Li/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/r;->a()V

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Li/e1;->b()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    iget-object v0, v0, Li/e1;->i:Li/o1;

    iget v0, v0, Li/o1;->e:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    iget-object v0, v0, Li/e1;->i:Li/o1;

    iget v0, v0, Li/o1;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-super {v0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    iget-object v0, v0, Li/e1;->i:Li/o1;

    iget v0, v0, Li/o1;->c:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-static {v0}, Li/h1;->f(Li/h1;)[I

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    iget-object v0, v0, Li/e1;->i:Li/o1;

    iget-object v0, v0, Li/o1;->f:[I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-boolean v0, Li/b4;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-static {v0}, Li/h1;->g(Li/h1;)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_2

    iget-object v0, v0, Li/e1;->i:Li/o1;

    iget v0, v0, Li/o1;->a:I

    return v0

    :cond_2
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 2

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    instance-of v1, v0, Lm0/t;

    if-eqz v1, :cond_0

    check-cast v0, Lm0/t;

    iget-object v0, v0, Lm0/t;->a:Landroid/view/ActionMode$Callback;

    :cond_0
    return-object v0
.end method

.method public getFirstBaselineToTopHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getLastBaselineToBottomHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, v1

    return v0
.end method

.method public getSuperCaller()Li/f1;
    .locals 2

    iget-object v0, p0, Li/h1;->g:Le/n0;

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, Li/g1;

    invoke-direct {v0, p0}, Li/g1;-><init>(Li/h1;)V

    iput-object v0, p0, Li/h1;->g:Le/n0;

    goto :goto_0

    :cond_0
    new-instance v0, Le/n0;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Le/n0;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Li/h1;->g:Le/n0;

    :cond_1
    :goto_0
    iget-object v0, p0, Li/h1;->g:Le/n0;

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Li/h1;->b:Li/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/r;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Li/h1;->b:Li/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li/r;->d()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Li/h1;->c:Li/e1;

    invoke-virtual {v0}, Li/e1;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Li/h1;->c:Li/e1;

    invoke-virtual {v0}, Li/e1;->e()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Li/h1;->l()V

    invoke-super {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTextClassifier()Landroid/view/textclassifier/TextClassifier;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Li/h1;->d:Li/a0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Li/a0;->d:Ljava/lang/Object;

    check-cast v1, Landroid/view/textclassifier/TextClassifier;

    if-nez v1, :cond_1

    iget-object v0, v0, Li/a0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Li/x0;->a(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v1

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-super {v0}, Landroid/widget/TextView;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public getTextMetricsParamsCompat()Lg0/e;
    .locals 1

    invoke-static {p0}, Lc3/h;->c1(Landroid/widget/TextView;)Lg0/e;

    move-result-object v0

    return-object v0
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Li/h1;->h:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Li/h1;->h:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La;->n(Ljava/lang/Object;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_1

    throw v1

    :cond_1
    invoke-static {p0}, Lc3/h;->c1(Landroid/widget/TextView;)Lg0/e;

    throw v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    invoke-super {p0, p1}, Landroid/widget/TextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    iget-object v1, p0, Li/h1;->c:Li/e1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0, p1}, Li/e1;->h(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    invoke-static {p0, p1, v0}, Lr3/q;->n(Landroid/view/View;Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;)V

    return-object v0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/widget/TextView;->onLayout(ZIIII)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_0

    sget-boolean p2, Li/b4;->b:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Li/e1;->i:Li/o1;

    invoke-virtual {p1}, Li/o1;->a()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-virtual {p0}, Li/h1;->l()V

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_0

    sget-boolean p2, Li/b4;->b:Z

    if-nez p2, :cond_0

    iget-object p1, p1, Li/e1;->i:Li/o1;

    invoke-virtual {p1}, Li/o1;->f()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Li/o1;->a()V

    :cond_0
    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Li/h1;->getEmojiTextViewHelper()Li/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Li/b0;->b(Z)V

    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithConfiguration(IIII)V
    .locals 1

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-static {v0, p1, p2, p3, p4}, Li/h1;->h(Li/h1;IIII)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3, p4}, Li/e1;->i(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setAutoSizeTextTypeUniformWithPresetSizes([II)V
    .locals 1

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-static {v0, p1, p2}, Li/h1;->i(Li/h1;[II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, Li/e1;->j([II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 1

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-static {v0, p1}, Li/h1;->j(Li/h1;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Li/e1;->k(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li/h1;->b:Li/r;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Li/r;->f()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Li/h1;->b:Li/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Li/r;->g(I)V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Li/e1;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Li/e1;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 4
    invoke-static {v0, p1}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 5
    invoke-static {v0, p2}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 6
    invoke-static {v0, p3}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 7
    invoke-static {v0, p4}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 8
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Li/h1;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Li/e1;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Li/e1;->b()V

    :cond_0
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(IIII)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 4
    invoke-static {v0, p1}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p2, :cond_1

    .line 5
    invoke-static {v0, p2}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p3, :cond_2

    .line 6
    invoke-static {v0, p3}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_2

    :cond_2
    move-object p3, v1

    :goto_2
    if-eqz p4, :cond_3

    .line 7
    invoke-static {v0, p4}, Lr3/q;->g(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 8
    :cond_3
    invoke-virtual {p0, p1, p2, p3, v1}, Li/h1;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Li/e1;->b()V

    :cond_4
    return-void
.end method

.method public final setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Li/h1;->c:Li/e1;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Li/e1;->b()V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p1, p0}, Lc3/h;->M2(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Li/h1;->getEmojiTextViewHelper()Li/b0;

    move-result-object v0

    invoke-virtual {v0, p1}, Li/b0;->c(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Li/h1;->getEmojiTextViewHelper()Li/b0;

    move-result-object v0

    iget-object v0, v0, Li/b0;->b:Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lf2/e;

    invoke-virtual {v0, p1}, Lf2/e;->u([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setFirstBaselineToTopHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    invoke-interface {v0, p1}, Li/f1;->a(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lc3/h;->q2(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLastBaselineToBottomHeight(I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    invoke-interface {v0, p1}, Li/f1;->u(I)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lc3/h;->s2(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public setLineHeight(I)V
    .locals 2

    invoke-static {p1}, Lc3/h;->W(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public setPrecomputedText(Lg0/f;)V
    .locals 2

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    throw v1

    :cond_0
    invoke-static {p0}, Lc3/h;->c1(Landroid/widget/TextView;)Lg0/e;

    throw v1
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Li/h1;->b:Li/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Li/r;->i(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Li/h1;->b:Li/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Li/r;->j(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Li/h1;->c:Li/e1;

    invoke-virtual {v0, p1}, Li/e1;->l(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Li/e1;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Li/h1;->c:Li/e1;

    invoke-virtual {v0, p1}, Li/e1;->m(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Li/e1;->b()V

    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Li/h1;->c:Li/e1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Li/e1;->g(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public setTextClassifier(Landroid/view/textclassifier/TextClassifier;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Li/h1;->d:Li/a0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, Li/a0;->d:Ljava/lang/Object;

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Li/h1;->getSuperCaller()Li/f1;

    move-result-object v0

    check-cast v0, Le/n0;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/h1;

    invoke-static {v0, p1}, Li/h1;->k(Li/h1;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method

.method public setTextFuture(Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Lg0/f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Li/h1;->h:Ljava/util/concurrent/Future;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setTextMetricsParamsCompat(Lg0/e;)V
    .locals 5

    iget-object v0, p1, Lg0/e;->b:Landroid/text/TextDirectionHeuristic;

    sget-object v1, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v4, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_2

    const/4 v2, 0x2

    goto :goto_0

    :cond_2
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_3

    const/4 v2, 0x3

    goto :goto_0

    :cond_3
    sget-object v4, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_4

    const/4 v2, 0x4

    goto :goto_0

    :cond_4
    sget-object v4, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne v0, v4, :cond_5

    const/4 v2, 0x5

    goto :goto_0

    :cond_5
    if-ne v0, v3, :cond_6

    const/4 v2, 0x6

    goto :goto_0

    :cond_6
    if-ne v0, v1, :cond_7

    const/4 v2, 0x7

    :cond_7
    :goto_0
    invoke-static {p0, v2}, Lm0/p;->h(Landroid/view/View;I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    iget-object v1, p1, Lg0/e;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    iget v0, p1, Lg0/e;->c:I

    invoke-static {p0, v0}, Lm0/q;->e(Landroid/widget/TextView;I)V

    iget p1, p1, Lg0/e;->d:I

    invoke-static {p0, p1}, Lm0/q;->h(Landroid/widget/TextView;I)V

    return-void
.end method

.method public final setTextSize(IF)V
    .locals 2

    sget-boolean v0, Li/b4;->b:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Li/h1;->c:Li/e1;

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    iget-object v0, v1, Li/e1;->i:Li/o1;

    invoke-virtual {v0}, Li/o1;->f()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1, p2}, Li/o1;->g(IF)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;I)V
    .locals 2

    iget-boolean v0, p0, Li/h1;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    if-lez p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lb0/g;->a:Le/n0;

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Context cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Li/h1;->f:Z

    if-eqz v0, :cond_3

    move-object p1, v0

    :cond_3
    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Li/h1;->f:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Li/h1;->f:Z

    throw p1
.end method
