.class public final Li/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Li/o3;

.field public c:Li/o3;

.field public d:Li/o3;

.field public e:Li/o3;

.field public f:Li/o3;

.field public g:Li/o3;

.field public h:Li/o3;

.field public final i:Li/o1;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Li/e1;->j:I

    const/4 v0, -0x1

    iput v0, p0, Li/e1;->k:I

    iput-object p1, p0, Li/e1;->a:Landroid/widget/TextView;

    new-instance v0, Li/o1;

    invoke-direct {v0, p1}, Li/o1;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Li/e1;->i:Li/o1;

    return-void
.end method

.method public static c(Landroid/content/Context;Li/x;I)Li/o3;
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Li/x;->a:Li/u2;

    invoke-virtual {v0, p0, p2}, Li/u2;->h(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-eqz p0, :cond_0

    new-instance p1, Li/o3;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Li/o3;-><init>(I)V

    const/4 p2, 0x1

    iput-boolean p2, p1, Li/o3;->b:Z

    iput-object p0, p1, Li/o3;->c:Ljava/lang/Object;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit p1

    throw p0
.end method

.method public static h(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V
    .locals 10

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_d

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p0

    if-lt v0, v1, :cond_0

    invoke-static {p2, p0}, Ll0/a;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-lt v0, v1, :cond_1

    invoke-static {p2, p0}, Ll0/a;->a(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    goto/16 :goto_6

    :cond_1
    iget p1, p2, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    iget v0, p2, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    if-le p1, v0, :cond_2

    move v1, v0

    goto :goto_0

    :cond_2
    move v1, p1

    :goto_0
    if-le p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move p1, v0

    :goto_1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-ltz v1, :cond_c

    if-le p1, v0, :cond_4

    goto/16 :goto_5

    :cond_4
    iget v4, p2, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit16 v4, v4, 0xfff

    const/16 v5, 0x81

    if-eq v4, v5, :cond_b

    const/16 v5, 0xe1

    if-eq v4, v5, :cond_b

    const/16 v5, 0x12

    if-ne v4, v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const/16 v3, 0x800

    if-gt v0, v3, :cond_6

    invoke-static {p2, p0, v1, p1}, Lc3/h;->u2(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto/16 :goto_6

    :cond_6
    sub-int v0, p1, v1

    const/16 v3, 0x400

    if-le v0, v3, :cond_7

    move v3, v2

    goto :goto_2

    :cond_7
    move v3, v0

    :goto_2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v4

    sub-int/2addr v4, p1

    rsub-int v5, v3, 0x800

    const-wide v6, 0x3fe999999999999aL    # 0.8

    int-to-double v8, v5

    mul-double/2addr v8, v6

    double-to-int v6, v8

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int v6, v5, v6

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int/2addr v5, v4

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v1, v5

    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_8

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v5, v5, -0x1

    :cond_8
    add-int v6, p1, v4

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    invoke-interface {p0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v6

    if-eqz v6, :cond_9

    add-int/lit8 v4, v4, -0x1

    :cond_9
    add-int v6, v5, v3

    add-int v8, v6, v4

    if-eq v3, v0, :cond_a

    add-int v0, v1, v5

    invoke-interface {p0, v1, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    add-int/2addr v4, p1

    invoke-interface {p0, p1, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/CharSequence;

    aput-object v0, p1, v2

    aput-object p0, p1, v7

    invoke-static {p1}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    goto :goto_3

    :cond_a
    add-int/2addr v8, v1

    invoke-interface {p0, v1, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :goto_3
    invoke-static {p2, p0, v5, v6}, Lc3/h;->u2(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_6

    :cond_b
    :goto_4
    invoke-static {p2, v3, v2, v2}, Lc3/h;->u2(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    goto :goto_6

    :cond_c
    :goto_5
    invoke-static {p2, v3, v2, v2}, Lc3/h;->u2(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    :cond_d
    :goto_6
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Li/o3;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Li/e1;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Li/x;->d(Landroid/graphics/drawable/Drawable;Li/o3;[I)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Li/e1;->b:Li/o3;

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Li/e1;->a:Landroid/widget/TextView;

    if-nez v0, :cond_0

    iget-object v0, p0, Li/e1;->c:Li/o3;

    if-nez v0, :cond_0

    iget-object v0, p0, Li/e1;->d:Li/o3;

    if-nez v0, :cond_0

    iget-object v0, p0, Li/e1;->e:Li/o3;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v4, v0, v2

    iget-object v5, p0, Li/e1;->b:Li/o3;

    invoke-virtual {p0, v4, v5}, Li/e1;->a(Landroid/graphics/drawable/Drawable;Li/o3;)V

    const/4 v4, 0x1

    aget-object v4, v0, v4

    iget-object v5, p0, Li/e1;->c:Li/o3;

    invoke-virtual {p0, v4, v5}, Li/e1;->a(Landroid/graphics/drawable/Drawable;Li/o3;)V

    aget-object v4, v0, v1

    iget-object v5, p0, Li/e1;->d:Li/o3;

    invoke-virtual {p0, v4, v5}, Li/e1;->a(Landroid/graphics/drawable/Drawable;Li/o3;)V

    const/4 v4, 0x3

    aget-object v0, v0, v4

    iget-object v4, p0, Li/e1;->e:Li/o3;

    invoke-virtual {p0, v0, v4}, Li/e1;->a(Landroid/graphics/drawable/Drawable;Li/o3;)V

    :cond_1
    iget-object v0, p0, Li/e1;->f:Li/o3;

    if-nez v0, :cond_2

    iget-object v0, p0, Li/e1;->g:Li/o3;

    if-eqz v0, :cond_3

    :cond_2
    invoke-static {v3}, Li/a1;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Li/e1;->f:Li/o3;

    invoke-virtual {p0, v2, v3}, Li/e1;->a(Landroid/graphics/drawable/Drawable;Li/o3;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Li/e1;->g:Li/o3;

    invoke-virtual {p0, v0, v1}, Li/e1;->a(Landroid/graphics/drawable/Drawable;Li/o3;)V

    :cond_3
    return-void
.end method

.method public final d()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Li/e1;->h:Li/o3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Li/o3;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Li/e1;->h:Li/o3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Li/o3;->d:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final f(Landroid/util/AttributeSet;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    iget-object v9, v0, Li/e1;->a:Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {}, Li/x;->a()Li/x;

    move-result-object v11

    sget-object v3, Ld/a;->h:[I

    invoke-static {v10, v7, v3, v8}, Le/c;->u(Landroid/content/Context;Landroid/util/AttributeSet;[II)Le/c;

    move-result-object v12

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v1, v12, Le/c;->d:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Landroid/content/res/TypedArray;

    move-object v1, v9

    move-object/from16 v4, p1

    move/from16 v6, p2

    invoke-static/range {v1 .. v6}, Li0/v0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 v13, 0x0

    const/4 v14, -0x1

    invoke-virtual {v12, v13, v14}, Le/c;->n(II)I

    move-result v1

    const/4 v15, 0x3

    invoke-virtual {v12, v15}, Le/c;->r(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v12, v15, v13}, Le/c;->n(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Li/e1;->c(Landroid/content/Context;Li/x;I)Li/o3;

    move-result-object v2

    iput-object v2, v0, Li/e1;->b:Li/o3;

    :cond_0
    const/4 v6, 0x1

    invoke-virtual {v12, v6}, Le/c;->r(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v12, v6, v13}, Le/c;->n(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Li/e1;->c(Landroid/content/Context;Li/x;I)Li/o3;

    move-result-object v2

    iput-object v2, v0, Li/e1;->c:Li/o3;

    :cond_1
    const/4 v5, 0x4

    invoke-virtual {v12, v5}, Le/c;->r(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v12, v5, v13}, Le/c;->n(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Li/e1;->c(Landroid/content/Context;Li/x;I)Li/o3;

    move-result-object v2

    iput-object v2, v0, Li/e1;->d:Li/o3;

    :cond_2
    const/4 v4, 0x2

    invoke-virtual {v12, v4}, Le/c;->r(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v12, v4, v13}, Le/c;->n(II)I

    move-result v2

    invoke-static {v10, v11, v2}, Li/e1;->c(Landroid/content/Context;Li/x;I)Li/o3;

    move-result-object v2

    iput-object v2, v0, Li/e1;->e:Li/o3;

    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v3, 0x5

    invoke-virtual {v12, v3}, Le/c;->r(I)Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-virtual {v12, v3, v13}, Le/c;->n(II)I

    move-result v4

    invoke-static {v10, v11, v4}, Li/e1;->c(Landroid/content/Context;Li/x;I)Li/o3;

    move-result-object v4

    iput-object v4, v0, Li/e1;->f:Li/o3;

    :cond_4
    const/4 v4, 0x6

    invoke-virtual {v12, v4}, Le/c;->r(I)Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-virtual {v12, v4, v13}, Le/c;->n(II)I

    move-result v3

    invoke-static {v10, v11, v3}, Li/e1;->c(Landroid/content/Context;Li/x;I)Li/o3;

    move-result-object v3

    iput-object v3, v0, Li/e1;->g:Li/o3;

    :cond_5
    invoke-virtual {v12}, Le/c;->v()V

    invoke-virtual {v9}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v3

    instance-of v3, v3, Landroid/text/method/PasswordTransformationMethod;

    sget-object v12, Ld/a;->w:[I

    const/16 v4, 0xe

    const/16 v15, 0xf

    if-eq v1, v14, :cond_9

    new-instance v5, Le/c;

    invoke-virtual {v10, v1, v12}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-direct {v5, v10, v1}, Le/c;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v3, :cond_6

    invoke-virtual {v5, v4}, Le/c;->r(I)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v5, v4, v13}, Le/c;->b(IZ)Z

    move-result v1

    move/from16 v20, v6

    goto :goto_0

    :cond_6
    move v1, v13

    move/from16 v20, v1

    :goto_0
    invoke-virtual {v0, v10, v5}, Li/e1;->n(Landroid/content/Context;Le/c;)V

    invoke-virtual {v5, v15}, Le/c;->r(I)Z

    move-result v21

    if-eqz v21, :cond_7

    invoke-virtual {v5, v15}, Le/c;->o(I)Ljava/lang/String;

    move-result-object v21

    const/16 v6, 0xd

    goto :goto_1

    :cond_7
    const/16 v6, 0xd

    const/16 v21, 0x0

    :goto_1
    invoke-virtual {v5, v6}, Le/c;->r(I)Z

    move-result v18

    if-eqz v18, :cond_8

    invoke-virtual {v5, v6}, Le/c;->o(I)Ljava/lang/String;

    move-result-object v22

    goto :goto_2

    :cond_8
    const/16 v22, 0x0

    :goto_2
    invoke-virtual {v5}, Le/c;->v()V

    goto :goto_3

    :cond_9
    move v1, v13

    move/from16 v20, v1

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_3
    new-instance v5, Le/c;

    invoke-virtual {v10, v7, v12, v8, v13}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    invoke-direct {v5, v10, v6}, Le/c;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v3, :cond_a

    invoke-virtual {v5, v4}, Le/c;->r(I)Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-virtual {v5, v4, v13}, Le/c;->b(IZ)Z

    move-result v1

    const/16 v20, 0x1

    :cond_a
    invoke-virtual {v5, v15}, Le/c;->r(I)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v5, v15}, Le/c;->o(I)Ljava/lang/String;

    move-result-object v21

    :cond_b
    const/16 v4, 0xd

    invoke-virtual {v5, v4}, Le/c;->r(I)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v5, v4}, Le/c;->o(I)Ljava/lang/String;

    move-result-object v22

    :cond_c
    move-object/from16 v4, v22

    const/16 v6, 0x1c

    if-lt v2, v6, :cond_d

    invoke-virtual {v5, v13}, Le/c;->r(I)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v5, v13, v14}, Le/c;->e(II)I

    move-result v2

    if-nez v2, :cond_d

    const/4 v2, 0x0

    invoke-virtual {v9, v13, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_d
    invoke-virtual {v0, v10, v5}, Li/e1;->n(Landroid/content/Context;Le/c;)V

    invoke-virtual {v5}, Le/c;->v()V

    if-nez v3, :cond_e

    if-eqz v20, :cond_e

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_e
    iget-object v1, v0, Li/e1;->l:Landroid/graphics/Typeface;

    if-eqz v1, :cond_10

    iget v2, v0, Li/e1;->k:I

    if-ne v2, v14, :cond_f

    iget v2, v0, Li/e1;->j:I

    invoke-virtual {v9, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_4

    :cond_f
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_10
    :goto_4
    if-eqz v4, :cond_11

    invoke-static {v9, v4}, Li/c1;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_11
    if-eqz v21, :cond_12

    invoke-static/range {v21 .. v21}, Li/b1;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v9, v1}, Li/b1;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_12
    sget-object v12, Ld/a;->i:[I

    iget-object v6, v0, Li/e1;->i:Li/o1;

    iget-object v5, v6, Li/o1;->j:Landroid/content/Context;

    invoke-virtual {v5, v7, v12, v8, v13}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v4

    iget-object v1, v6, Li/o1;->i:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v15, 0x5

    move-object v3, v12

    move-object/from16 v16, v4

    const/4 v14, 0x2

    move-object/from16 v4, p1

    move-object/from16 v19, v5

    const/4 v14, 0x4

    move-object/from16 v5, v16

    move-object v14, v6

    move/from16 v6, p2

    invoke-static/range {v1 .. v6}, Li0/v0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-virtual {v1, v15, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v14, Li/o1;->a:I

    :cond_13
    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    const/high16 v4, -0x40800000    # -1.0f

    if-eqz v3, :cond_14

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    :goto_5
    const/4 v3, 0x2

    goto :goto_6

    :cond_14
    move v2, v4

    goto :goto_5

    :goto_6
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v5

    :goto_7
    const/4 v3, 0x1

    goto :goto_8

    :cond_15
    move v5, v4

    goto :goto_7

    :goto_8
    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v1, v3, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v6

    :goto_9
    const/4 v8, 0x3

    goto :goto_a

    :cond_16
    move v6, v4

    goto :goto_9

    :goto_a
    invoke-virtual {v1, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_19

    invoke-virtual {v1, v8, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v15

    if-lez v15, :cond_19

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v15}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/TypedArray;->length()I

    move-result v15

    new-array v13, v15, [I

    if-lez v15, :cond_18

    const/4 v4, 0x0

    :goto_b
    if-ge v4, v15, :cond_17

    const/4 v3, -0x1

    invoke-virtual {v8, v4, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v21

    aput v21, v13, v4

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x1

    goto :goto_b

    :cond_17
    invoke-static {v13}, Li/o1;->b([I)[I

    move-result-object v3

    iput-object v3, v14, Li/o1;->f:[I

    invoke-virtual {v14}, Li/o1;->i()Z

    :cond_18
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    :cond_19
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v14}, Li/o1;->j()Z

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v1, :cond_1e

    iget v1, v14, Li/o1;->a:I

    const/4 v4, 0x1

    if-ne v1, v4, :cond_1f

    iget-boolean v1, v14, Li/o1;->g:Z

    if-nez v1, :cond_1d

    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v8, v5, v4

    if-nez v8, :cond_1a

    const/high16 v5, 0x41400000    # 12.0f

    const/4 v8, 0x2

    invoke-static {v8, v5, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    goto :goto_c

    :cond_1a
    const/4 v8, 0x2

    :goto_c
    cmpl-float v13, v6, v4

    if-nez v13, :cond_1b

    const/high16 v6, 0x42e00000    # 112.0f

    invoke-static {v8, v6, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v6

    :cond_1b
    cmpl-float v1, v2, v4

    if-nez v1, :cond_1c

    move v2, v3

    :cond_1c
    invoke-virtual {v14, v5, v6, v2}, Li/o1;->k(FFF)V

    :cond_1d
    invoke-virtual {v14}, Li/o1;->h()Z

    goto :goto_d

    :cond_1e
    const/4 v1, 0x0

    iput v1, v14, Li/o1;->a:I

    :cond_1f
    :goto_d
    sget-boolean v1, Li/b4;->b:Z

    if-eqz v1, :cond_21

    iget v1, v14, Li/o1;->a:I

    if-eqz v1, :cond_21

    iget-object v1, v14, Li/o1;->f:[I

    array-length v2, v1

    if-lez v2, :cond_21

    invoke-static {v9}, Li/c1;->a(Landroid/widget/TextView;)I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v2, v2, v4

    if-eqz v2, :cond_20

    iget v1, v14, Li/o1;->d:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, v14, Li/o1;->e:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v4, v14, Li/o1;->c:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v9, v1, v2, v4, v5}, Li/c1;->b(Landroid/widget/TextView;IIII)V

    goto :goto_e

    :cond_20
    const/4 v5, 0x0

    invoke-static {v9, v1, v5}, Li/c1;->c(Landroid/widget/TextView;[II)V

    :cond_21
    :goto_e
    new-instance v1, Le/c;

    invoke-virtual {v10, v7, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-direct {v1, v10, v2}, Le/c;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/16 v2, 0x8

    const/4 v4, -0x1

    invoke-virtual {v1, v2, v4}, Le/c;->n(II)I

    move-result v2

    if-eq v2, v4, :cond_22

    invoke-virtual {v11, v10, v2}, Li/x;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_f
    const/16 v5, 0xd

    goto :goto_10

    :cond_22
    const/4 v2, 0x0

    goto :goto_f

    :goto_10
    invoke-virtual {v1, v5, v4}, Le/c;->n(II)I

    move-result v5

    if-eq v5, v4, :cond_23

    invoke-virtual {v11, v10, v5}, Li/x;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_11

    :cond_23
    const/4 v5, 0x0

    :goto_11
    const/16 v6, 0x9

    invoke-virtual {v1, v6, v4}, Le/c;->n(II)I

    move-result v6

    if-eq v6, v4, :cond_24

    invoke-virtual {v11, v10, v6}, Li/x;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    :goto_12
    const/4 v7, 0x6

    goto :goto_13

    :cond_24
    const/4 v6, 0x0

    goto :goto_12

    :goto_13
    invoke-virtual {v1, v7, v4}, Le/c;->n(II)I

    move-result v7

    if-eq v7, v4, :cond_25

    invoke-virtual {v11, v10, v7}, Li/x;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_14

    :cond_25
    const/4 v7, 0x0

    :goto_14
    const/16 v8, 0xa

    invoke-virtual {v1, v8, v4}, Le/c;->n(II)I

    move-result v8

    if-eq v8, v4, :cond_26

    invoke-virtual {v11, v10, v8}, Li/x;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_15

    :cond_26
    const/4 v8, 0x0

    :goto_15
    const/4 v12, 0x7

    invoke-virtual {v1, v12, v4}, Le/c;->n(II)I

    move-result v12

    if-eq v12, v4, :cond_27

    invoke-virtual {v11, v10, v12}, Li/x;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_16

    :cond_27
    const/4 v4, 0x0

    :goto_16
    if-nez v8, :cond_32

    if-eqz v4, :cond_28

    goto :goto_1f

    :cond_28
    if-nez v2, :cond_29

    if-nez v5, :cond_29

    if-nez v6, :cond_29

    if-eqz v7, :cond_37

    :cond_29
    invoke-static {v9}, Li/a1;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const/4 v8, 0x0

    aget-object v10, v4, v8

    if-nez v10, :cond_2f

    const/4 v11, 0x2

    aget-object v12, v4, v11

    if-eqz v12, :cond_2a

    goto :goto_1b

    :cond_2a
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v2, :cond_2b

    goto :goto_17

    :cond_2b
    aget-object v2, v4, v8

    :goto_17
    if-eqz v5, :cond_2c

    goto :goto_18

    :cond_2c
    const/4 v5, 0x1

    aget-object v5, v4, v5

    :goto_18
    if-eqz v6, :cond_2d

    goto :goto_19

    :cond_2d
    const/4 v6, 0x2

    aget-object v6, v4, v6

    :goto_19
    if-eqz v7, :cond_2e

    goto :goto_1a

    :cond_2e
    const/4 v7, 0x3

    aget-object v7, v4, v7

    :goto_1a
    invoke-virtual {v9, v2, v5, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_24

    :cond_2f
    :goto_1b
    if-eqz v5, :cond_30

    :goto_1c
    const/4 v2, 0x2

    goto :goto_1d

    :cond_30
    const/4 v2, 0x1

    aget-object v5, v4, v2

    goto :goto_1c

    :goto_1d
    aget-object v2, v4, v2

    if-eqz v7, :cond_31

    goto :goto_1e

    :cond_31
    const/4 v6, 0x3

    aget-object v7, v4, v6

    :goto_1e
    invoke-static {v9, v10, v5, v2, v7}, Li/a1;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_24

    :cond_32
    :goto_1f
    invoke-static {v9}, Li/a1;->a(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v8, :cond_33

    goto :goto_20

    :cond_33
    const/4 v6, 0x0

    aget-object v8, v2, v6

    :goto_20
    if-eqz v5, :cond_34

    goto :goto_21

    :cond_34
    const/4 v5, 0x1

    aget-object v5, v2, v5

    :goto_21
    if-eqz v4, :cond_35

    goto :goto_22

    :cond_35
    const/4 v4, 0x2

    aget-object v4, v2, v4

    :goto_22
    if-eqz v7, :cond_36

    goto :goto_23

    :cond_36
    const/4 v6, 0x3

    aget-object v7, v2, v6

    :goto_23
    invoke-static {v9, v8, v5, v4, v7}, Li/a1;->b(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_37
    :goto_24
    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Le/c;->r(I)Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-virtual {v1, v2}, Le/c;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-static {v9, v2}, Lm0/q;->f(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_38
    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Le/c;->r(I)Z

    move-result v4

    if-eqz v4, :cond_39

    const/4 v4, -0x1

    invoke-virtual {v1, v2, v4}, Le/c;->k(II)I

    move-result v2

    const/4 v5, 0x0

    invoke-static {v2, v5}, Li/t1;->b(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    invoke-static {v9, v2}, Lm0/q;->g(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :goto_25
    const/16 v2, 0xf

    goto :goto_26

    :cond_39
    const/4 v4, -0x1

    goto :goto_25

    :goto_26
    invoke-virtual {v1, v2, v4}, Le/c;->e(II)I

    move-result v2

    const/16 v5, 0x12

    invoke-virtual {v1, v5, v4}, Le/c;->e(II)I

    move-result v5

    const/16 v6, 0x13

    invoke-virtual {v1, v6, v4}, Le/c;->e(II)I

    move-result v6

    invoke-virtual {v1}, Le/c;->v()V

    if-eq v2, v4, :cond_3a

    invoke-static {v9, v2}, Lc3/h;->q2(Landroid/widget/TextView;I)V

    :cond_3a
    if-eq v5, v4, :cond_3b

    invoke-static {v9, v5}, Lc3/h;->s2(Landroid/widget/TextView;I)V

    :cond_3b
    if-eq v6, v4, :cond_3c

    invoke-static {v6}, Lc3/h;->W(I)V

    invoke-virtual {v9}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v1

    if-eq v6, v1, :cond_3c

    sub-int/2addr v6, v1

    int-to-float v1, v6

    invoke-virtual {v9, v1, v3}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_3c
    return-void
.end method

.method public final g(Landroid/content/Context;I)V
    .locals 4

    sget-object v0, Ld/a;->w:[I

    new-instance v1, Le/c;

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v1, p1, p2}, Le/c;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/16 p2, 0xe

    invoke-virtual {v1, p2}, Le/c;->r(I)Z

    move-result v0

    iget-object v2, p0, Li/e1;->a:Landroid/widget/TextView;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v1, p2, v3}, Le/c;->b(IZ)Z

    move-result p2

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    invoke-virtual {v1, v3}, Le/c;->r(I)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, -0x1

    invoke-virtual {v1, v3, p2}, Le/c;->e(II)I

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    invoke-virtual {v2, v3, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, v1}, Li/e1;->n(Landroid/content/Context;Le/c;)V

    const/16 p1, 0xd

    invoke-virtual {v1, p1}, Le/c;->r(I)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {v1, p1}, Le/c;->o(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v2, p1}, Li/c1;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {v1}, Le/c;->v()V

    iget-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget p2, p0, Li/e1;->j:I

    invoke-virtual {v2, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public final i(IIII)V
    .locals 2

    iget-object v0, p0, Li/e1;->i:Li/o1;

    invoke-virtual {v0}, Li/o1;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Li/o1;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    int-to-float p1, p1

    invoke-static {p4, p1, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    invoke-static {p4, p2, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    invoke-static {p4, p3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    invoke-virtual {v0, p1, p2, p3}, Li/o1;->k(FFF)V

    invoke-virtual {v0}, Li/o1;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Li/o1;->a()V

    :cond_0
    return-void
.end method

.method public final j([II)V
    .locals 6

    iget-object v0, p0, Li/e1;->i:Li/o1;

    invoke-virtual {v0}, Li/o1;->j()Z

    move-result v1

    if-eqz v1, :cond_4

    array-length v1, p1

    const/4 v2, 0x0

    if-lez v1, :cond_3

    new-array v3, v1, [I

    if-nez p2, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    goto :goto_1

    :cond_0
    iget-object v4, v0, Li/o1;->j:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    :goto_0
    if-ge v2, v1, :cond_1

    aget v5, p1, v2

    int-to-float v5, v5

    invoke-static {p2, v5, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    aput v5, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {v3}, Li/o1;->b([I)[I

    move-result-object p2

    iput-object p2, v0, Li/o1;->f:[I

    invoke-virtual {v0}, Li/o1;->i()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "None of the preset sizes is valid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    iput-boolean v2, v0, Li/o1;->g:Z

    :goto_2
    invoke-virtual {v0}, Li/o1;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, Li/o1;->a()V

    :cond_4
    return-void
.end method

.method public final k(I)V
    .locals 4

    iget-object v0, p0, Li/e1;->i:Li/o1;

    invoke-virtual {v0}, Li/o1;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Li/o1;->j:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/4 v1, 0x2

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    const/high16 v3, 0x42e00000    # 112.0f

    invoke-static {v1, v3, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2, p1, v1}, Li/o1;->k(FFF)V

    invoke-virtual {v0}, Li/o1;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Li/o1;->a()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown auto-size text type: "

    invoke-static {v1, p1}, La;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    iput p1, v0, Li/o1;->a:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Li/o1;->d:F

    iput v1, v0, Li/o1;->e:F

    iput v1, v0, Li/o1;->c:F

    new-array v1, p1, [I

    iput-object v1, v0, Li/o1;->f:[I

    iput-boolean p1, v0, Li/o1;->b:Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final l(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Li/e1;->h:Li/o3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Li/o3;

    invoke-direct {v0, v1}, Li/o3;-><init>(I)V

    iput-object v0, p0, Li/e1;->h:Li/o3;

    :cond_0
    iget-object v0, p0, Li/e1;->h:Li/o3;

    iput-object p1, v0, Li/o3;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, v0, Li/o3;->b:Z

    iput-object v0, p0, Li/e1;->b:Li/o3;

    iput-object v0, p0, Li/e1;->c:Li/o3;

    iput-object v0, p0, Li/e1;->d:Li/o3;

    iput-object v0, p0, Li/e1;->e:Li/o3;

    iput-object v0, p0, Li/e1;->f:Li/o3;

    iput-object v0, p0, Li/e1;->g:Li/o3;

    return-void
.end method

.method public final m(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Li/e1;->h:Li/o3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Li/o3;

    invoke-direct {v0, v1}, Li/o3;-><init>(I)V

    iput-object v0, p0, Li/e1;->h:Li/o3;

    :cond_0
    iget-object v0, p0, Li/e1;->h:Li/o3;

    iput-object p1, v0, Li/o3;->d:Ljava/lang/Object;

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, v0, Li/o3;->a:Z

    iput-object v0, p0, Li/e1;->b:Li/o3;

    iput-object v0, p0, Li/e1;->c:Li/o3;

    iput-object v0, p0, Li/e1;->d:Li/o3;

    iput-object v0, p0, Li/e1;->e:Li/o3;

    iput-object v0, p0, Li/e1;->f:Li/o3;

    iput-object v0, p0, Li/e1;->g:Li/o3;

    return-void
.end method

.method public final n(Landroid/content/Context;Le/c;)V
    .locals 10

    iget v0, p0, Li/e1;->j:I

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Le/c;->k(II)I

    move-result v0

    iput v0, p0, Li/e1;->j:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, -0x1

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_0

    const/16 v4, 0xb

    invoke-virtual {p2, v4, v2}, Le/c;->k(II)I

    move-result v4

    iput v4, p0, Li/e1;->k:I

    if-eq v4, v2, :cond_0

    iget v4, p0, Li/e1;->j:I

    and-int/2addr v4, v1

    iput v4, p0, Li/e1;->j:I

    :cond_0
    const/16 v4, 0xa

    invoke-virtual {p2, v4}, Le/c;->r(I)Z

    move-result v5

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v5, :cond_6

    invoke-virtual {p2, v6}, Le/c;->r(I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2, v8}, Le/c;->r(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iput-boolean v7, p0, Li/e1;->m:Z

    invoke-virtual {p2, v8, v8}, Le/c;->k(II)I

    move-result p1

    if-eq p1, v8, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    :cond_5
    :goto_0
    return-void

    :cond_6
    :goto_1
    const/4 v5, 0x0

    iput-object v5, p0, Li/e1;->l:Landroid/graphics/Typeface;

    invoke-virtual {p2, v6}, Le/c;->r(I)Z

    move-result v5

    if-eqz v5, :cond_7

    move v4, v6

    :cond_7
    iget v5, p0, Li/e1;->k:I

    iget v6, p0, Li/e1;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_c

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v9, p0, Li/e1;->a:Landroid/widget/TextView;

    invoke-direct {p1, v9}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v9, Li/y0;

    invoke-direct {v9, p0, v5, v6, p1}, Li/y0;-><init>(Li/e1;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Li/e1;->j:I

    invoke-virtual {p2, v4, p1, v9}, Le/c;->j(IILi/y0;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    if-lt v0, v3, :cond_9

    iget v0, p0, Li/e1;->k:I

    if-eq v0, v2, :cond_9

    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Li/e1;->k:I

    iget v5, p0, Li/e1;->j:I

    and-int/2addr v5, v1

    if-eqz v5, :cond_8

    move v5, v8

    goto :goto_2

    :cond_8
    move v5, v7

    :goto_2
    invoke-static {p1, v0, v5}, Li/d1;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    goto :goto_3

    :cond_9
    iput-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    :cond_a
    :goto_3
    iget-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_b

    move p1, v8

    goto :goto_4

    :cond_b
    move p1, v7

    :goto_4
    iput-boolean p1, p0, Li/e1;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_c
    iget-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_f

    invoke-virtual {p2, v4}, Le/c;->o(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_f

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_e

    iget p2, p0, Li/e1;->k:I

    if-eq p2, v2, :cond_e

    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Li/e1;->k:I

    iget v0, p0, Li/e1;->j:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    move v7, v8

    :cond_d
    invoke-static {p1, p2, v7}, Li/d1;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    goto :goto_5

    :cond_e
    iget p2, p0, Li/e1;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Li/e1;->l:Landroid/graphics/Typeface;

    :cond_f
    :goto_5
    return-void
.end method
