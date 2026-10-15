.class public final Lq3/k;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    iput p3, p0, Lq3/k;->c:I

    iput-object p1, p0, Lq3/k;->e:Ljava/lang/Object;

    iput-boolean p2, p0, Lq3/k;->d:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/CharSequence;)Lz2/a;
    .locals 13

    iget v0, p0, Lq3/k;->c:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Lq3/k;->e:Ljava/lang/Object;

    const-string v4, "$this$$receiver"

    packed-switch v0, :pswitch_data_0

    invoke-static {p2, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/List;

    iget-boolean v0, p0, Lq3/k;->d:Z

    const/4 v4, 0x0

    if-nez v0, :cond_3

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v5

    if-ne v5, v1, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    if-ne v0, v1, :cond_1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {p2, v0, p1, v4, v1}, Lq3/l;->Z2(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result p1

    if-gez p1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Lz2/a;

    invoke-direct {p2, p1, v0}, Lz2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "List has more than one element."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "List is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v5, Ln3/c;

    if-gez p1, :cond_4

    move p1, v4

    :cond_4
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-direct {v5, p1, v4, v1}, Ln3/a;-><init>(III)V

    instance-of v1, p2, Ljava/lang/String;

    iget v10, v5, Ln3/a;->d:I

    iget v11, v5, Ln3/a;->c:I

    if-eqz v1, :cond_a

    if-lez v10, :cond_5

    if-le p1, v11, :cond_6

    :cond_5
    if-gez v10, :cond_10

    if-gt v11, p1, :cond_10

    :cond_6
    :goto_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v7, v12

    check-cast v7, Ljava/lang/String;

    const/4 v4, 0x0

    move-object v8, p2

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    move v5, p1

    move v9, v0

    invoke-static/range {v4 .. v9}, Lq3/l;->f3(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_1

    :cond_8
    move-object v12, v2

    :goto_1
    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_9

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Lz2/a;

    invoke-direct {p2, p1, v12}, Lz2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    if-eq p1, v11, :cond_10

    add-int/2addr p1, v10

    goto :goto_0

    :cond_a
    if-lez v10, :cond_b

    if-le p1, v11, :cond_c

    :cond_b
    if-gez v10, :cond_10

    if-gt v11, p1, :cond_10

    :cond_c
    :goto_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v4, v12

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    move-object v6, p2

    move v7, p1

    move v9, v0

    invoke-static/range {v4 .. v9}, Lq3/l;->g3(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_3

    :cond_e
    move-object v12, v2

    :goto_3
    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_f

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, Lz2/a;

    invoke-direct {p2, p1, v12}, Lz2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_f
    if-eq p1, v11, :cond_10

    add-int/2addr p1, v10

    goto :goto_2

    :cond_10
    :goto_4
    move-object p2, v2

    :goto_5
    if-eqz p2, :cond_11

    iget-object p1, p2, Lz2/a;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v2, Lz2/a;

    iget-object p2, p2, Lz2/a;->b:Ljava/lang/Object;

    invoke-direct {v2, p2, p1}, Lz2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_11
    return-object v2

    :pswitch_0
    invoke-static {p2, v4}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, [C

    iget-boolean v0, p0, Lq3/k;->d:Z

    invoke-static {p1, p2, v0, v3}, Lq3/l;->a3(ILjava/lang/CharSequence;Z[C)I

    move-result p1

    if-gez p1, :cond_12

    goto :goto_6

    :cond_12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v2, Lz2/a;

    invoke-direct {v2, p1, p2}, Lz2/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_6
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq3/k;->c:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc3/k;

    check-cast p2, Lc3/i;

    invoke-interface {p1, p2}, Lc3/k;->x(Lc3/k;)Lc3/k;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p2, p1}, Lq3/k;->b(ILjava/lang/CharSequence;)Lz2/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p2, p1}, Lq3/k;->b(ILjava/lang/CharSequence;)Lz2/a;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
