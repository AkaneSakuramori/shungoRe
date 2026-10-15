.class public final Landroidx/emoji2/text/h;
.super Le/n0;
.source "SourceFile"


# instance fields
.field public volatile d:Landroidx/emoji2/text/s;

.field public volatile e:Lg/h;


# virtual methods
.method public final F()V
    .locals 2

    :try_start_0
    new-instance v0, Landroidx/emoji2/text/g;

    invoke-direct {v0, p0}, Landroidx/emoji2/text/g;-><init>(Landroidx/emoji2/text/h;)V

    iget-object v1, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/emoji2/text/m;

    iget-object v1, v1, Landroidx/emoji2/text/m;->f:Landroidx/emoji2/text/l;

    invoke-interface {v1, v0}, Landroidx/emoji2/text/l;->a(Lc3/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/emoji2/text/m;

    invoke-virtual {v1, v0}, Landroidx/emoji2/text/m;->d(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final G(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;
    .locals 11

    iget-object v0, p0, Landroidx/emoji2/text/h;->d:Landroidx/emoji2/text/s;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, p1, Landroidx/emoji2/text/y;

    if-eqz v1, :cond_0

    move-object v2, p1

    check-cast v2, Landroidx/emoji2/text/y;

    invoke-virtual {v2}, Landroidx/emoji2/text/y;->a()V

    :cond_0
    const-class v2, Landroidx/emoji2/text/z;

    if-nez v1, :cond_3

    :try_start_0
    instance-of v3, p1, Landroid/text/Spannable;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    instance-of v3, p1, Landroid/text/Spanned;

    if-eqz v3, :cond_2

    move-object v3, p1

    check-cast v3, Landroid/text/Spanned;

    add-int/lit8 v4, p2, -0x1

    add-int/lit8 v5, p3, 0x1

    invoke-interface {v3, v4, v5, v2}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v3

    if-gt v3, p3, :cond_2

    new-instance v3, Landroidx/emoji2/text/b0;

    invoke-direct {v3, p1}, Landroidx/emoji2/text/b0;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_8

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v3, Landroidx/emoji2/text/b0;

    move-object v4, p1

    check-cast v4, Landroid/text/Spannable;

    invoke-direct {v3, v4}, Landroidx/emoji2/text/b0;-><init>(Landroid/text/Spannable;)V

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_5

    iget-object v5, v3, Landroidx/emoji2/text/b0;->c:Landroid/text/Spannable;

    invoke-interface {v5, p2, p3, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroidx/emoji2/text/z;

    if-eqz v2, :cond_5

    array-length v5, v2

    if-lez v5, :cond_5

    array-length v5, v2

    move v6, v4

    :goto_2
    if-ge v6, v5, :cond_5

    aget-object v7, v2, v6

    iget-object v8, v3, Landroidx/emoji2/text/b0;->c:Landroid/text/Spannable;

    invoke-interface {v8, v7}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v8

    iget-object v9, v3, Landroidx/emoji2/text/b0;->c:Landroid/text/Spannable;

    invoke-interface {v9, v7}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v9

    if-eq v8, p3, :cond_4

    invoke-virtual {v3, v7}, Landroidx/emoji2/text/b0;->removeSpan(Ljava/lang/Object;)V

    :cond_4
    invoke-static {v8, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v9, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    if-eq p2, p3, :cond_16

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt p2, v2, :cond_6

    goto/16 :goto_6

    :cond_6
    new-instance v2, Landroidx/emoji2/text/r;

    iget-object v5, v0, Landroidx/emoji2/text/s;->b:Lg/h;

    iget-object v5, v5, Lg/h;->d:Ljava/lang/Object;

    check-cast v5, Landroidx/emoji2/text/w;

    invoke-direct {v2, v5}, Landroidx/emoji2/text/r;-><init>(Landroidx/emoji2/text/w;)V

    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v5

    move v6, v5

    move v5, v4

    move-object v4, v3

    :cond_7
    :goto_3
    move v3, p2

    :cond_8
    :goto_4
    const/16 v7, 0x21

    const/4 v8, 0x1

    const v9, 0x7fffffff

    const/4 v10, 0x2

    if-ge p2, p3, :cond_f

    if-ge v5, v9, :cond_f

    invoke-virtual {v2, v6}, Landroidx/emoji2/text/r;->a(I)I

    move-result v9

    if-eq v9, v8, :cond_d

    if-eq v9, v10, :cond_c

    const/4 v8, 0x3

    if-eq v9, v8, :cond_9

    goto :goto_4

    :cond_9
    if-nez p4, :cond_a

    iget-object v8, v2, Landroidx/emoji2/text/r;->d:Landroidx/emoji2/text/w;

    iget-object v8, v8, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/q;

    invoke-virtual {v0, p1, v3, p2, v8}, Landroidx/emoji2/text/s;->b(Ljava/lang/CharSequence;IILandroidx/emoji2/text/q;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_a
    if-nez v4, :cond_b

    new-instance v4, Landroidx/emoji2/text/b0;

    new-instance v8, Landroid/text/SpannableString;

    invoke-direct {v8, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v4, v8}, Landroidx/emoji2/text/b0;-><init>(Landroid/text/Spannable;)V

    :cond_b
    iget-object v8, v2, Landroidx/emoji2/text/r;->d:Landroidx/emoji2/text/w;

    iget-object v8, v8, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/q;

    iget-object v9, v0, Landroidx/emoji2/text/s;->a:Lf2/e;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, Landroidx/emoji2/text/z;

    invoke-direct {v9, v8}, Landroidx/emoji2/text/z;-><init>(Landroidx/emoji2/text/q;)V

    invoke-virtual {v4, v9, v3, p2, v7}, Landroidx/emoji2/text/b0;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_c
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v7

    add-int/2addr p2, v7

    if-ge p2, p3, :cond_8

    invoke-static {p1, p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    goto :goto_4

    :cond_d
    invoke-static {p1, v3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Character;->charCount(I)I

    move-result p2

    add-int/2addr v3, p2

    if-ge v3, p3, :cond_e

    invoke-static {p1, v3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p2

    move v6, p2

    :cond_e
    move p2, v3

    goto :goto_4

    :cond_f
    iget p3, v2, Landroidx/emoji2/text/r;->a:I

    if-ne p3, v10, :cond_13

    iget-object p3, v2, Landroidx/emoji2/text/r;->c:Landroidx/emoji2/text/w;

    iget-object p3, p3, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/q;

    if-eqz p3, :cond_13

    iget p3, v2, Landroidx/emoji2/text/r;->f:I

    if-gt p3, v8, :cond_10

    invoke-virtual {v2}, Landroidx/emoji2/text/r;->c()Z

    move-result p3

    if-eqz p3, :cond_13

    :cond_10
    if-ge v5, v9, :cond_13

    if-nez p4, :cond_11

    iget-object p3, v2, Landroidx/emoji2/text/r;->c:Landroidx/emoji2/text/w;

    iget-object p3, p3, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/q;

    invoke-virtual {v0, p1, v3, p2, p3}, Landroidx/emoji2/text/s;->b(Ljava/lang/CharSequence;IILandroidx/emoji2/text/q;)Z

    move-result p3

    if-nez p3, :cond_13

    :cond_11
    if-nez v4, :cond_12

    new-instance v4, Landroidx/emoji2/text/b0;

    invoke-direct {v4, p1}, Landroidx/emoji2/text/b0;-><init>(Ljava/lang/CharSequence;)V

    :cond_12
    iget-object p3, v2, Landroidx/emoji2/text/r;->c:Landroidx/emoji2/text/w;

    iget-object p3, p3, Landroidx/emoji2/text/w;->b:Landroidx/emoji2/text/q;

    iget-object p4, v0, Landroidx/emoji2/text/s;->a:Lf2/e;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p4, Landroidx/emoji2/text/z;

    invoke-direct {p4, p3}, Landroidx/emoji2/text/z;-><init>(Landroidx/emoji2/text/q;)V

    invoke-virtual {v4, p4, v3, p2, v7}, Landroidx/emoji2/text/b0;->setSpan(Ljava/lang/Object;III)V

    :cond_13
    if-eqz v4, :cond_15

    iget-object p2, v4, Landroidx/emoji2/text/b0;->c:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_14

    check-cast p1, Landroidx/emoji2/text/y;

    invoke-virtual {p1}, Landroidx/emoji2/text/y;->b()V

    :cond_14
    move-object p1, p2

    goto :goto_7

    :cond_15
    if-eqz v1, :cond_17

    :goto_5
    move-object p2, p1

    check-cast p2, Landroidx/emoji2/text/y;

    invoke-virtual {p2}, Landroidx/emoji2/text/y;->b()V

    goto :goto_7

    :cond_16
    :goto_6
    if-eqz v1, :cond_17

    goto :goto_5

    :cond_17
    :goto_7
    return-object p1

    :goto_8
    if-eqz v1, :cond_18

    check-cast p1, Landroidx/emoji2/text/y;

    invoke-virtual {p1}, Landroidx/emoji2/text/y;->b()V

    :cond_18
    throw p2
.end method

.method public final H(Landroid/view/inputmethod/EditorInfo;)V
    .locals 5

    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v1, p0, Landroidx/emoji2/text/h;->e:Lg/h;

    iget-object v1, v1, Lg/h;->c:Ljava/lang/Object;

    check-cast v1, La2/a;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lq0/b;->a(I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v4, v1, Lq0/b;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v1, v1, Lq0/b;->a:I

    add-int/2addr v2, v1

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v2, "android.support.text.emoji.emojiCompat_metadataVersion"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/emoji2/text/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "android.support.text.emoji.emojiCompat_replaceAll"

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
