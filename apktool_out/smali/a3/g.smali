.class public abstract La3/g;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;


# virtual methods
.method public final remove(I)Ljava/lang/Object;
    .locals 9

    move-object v0, p0

    check-cast v0, La3/i;

    iget v1, v0, La3/i;->d:I

    invoke-static {p1, v1}, Lj1/y;->b(II)V

    invoke-static {v0}, Lc3/h;->W0(Ljava/util/List;)I

    move-result v1

    if-ne p1, v1, :cond_0

    invoke-virtual {v0}, La3/i;->removeLast()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_0
    if-nez p1, :cond_1

    invoke-virtual {v0}, La3/i;->removeFirst()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_3

    :cond_1
    iget v1, v0, La3/i;->b:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, La3/i;->d(I)I

    move-result v1

    iget-object v2, v0, La3/i;->c:[Ljava/lang/Object;

    aget-object v3, v2, v1

    iget v4, v0, La3/i;->d:I

    const/4 v5, 0x1

    shr-int/2addr v4, v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-ge p1, v4, :cond_3

    iget p1, v0, La3/i;->b:I

    if-lt v1, p1, :cond_2

    add-int/lit8 v4, p1, 0x1

    invoke-static {v2, v2, v4, p1, v1}, La3/j;->T2([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_0

    :cond_2
    invoke-static {v2, v2, v5, v7, v1}, La3/j;->T2([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object p1, v0, La3/i;->c:[Ljava/lang/Object;

    array-length v1, p1

    sub-int/2addr v1, v5

    aget-object v1, p1, v1

    aput-object v1, p1, v7

    iget v1, v0, La3/i;->b:I

    add-int/lit8 v2, v1, 0x1

    array-length v4, p1

    sub-int/2addr v4, v5

    invoke-static {p1, p1, v2, v1, v4}, La3/j;->T2([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :goto_0
    iget-object p1, v0, La3/i;->c:[Ljava/lang/Object;

    iget v1, v0, La3/i;->b:I

    aput-object v6, p1, v1

    invoke-virtual {v0, v1}, La3/i;->c(I)I

    move-result p1

    iput p1, v0, La3/i;->b:I

    goto :goto_2

    :cond_3
    iget p1, v0, La3/i;->b:I

    invoke-static {v0}, Lc3/h;->W0(Ljava/util/List;)I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {v0, v2}, La3/i;->d(I)I

    move-result p1

    if-gt v1, p1, :cond_4

    iget-object v2, v0, La3/i;->c:[Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    add-int/lit8 v7, p1, 0x1

    invoke-static {v2, v2, v1, v4, v7}, La3/j;->T2([Ljava/lang/Object;[Ljava/lang/Object;III)V

    goto :goto_1

    :cond_4
    iget-object v2, v0, La3/i;->c:[Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    array-length v8, v2

    invoke-static {v2, v2, v1, v4, v8}, La3/j;->T2([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v1, v0, La3/i;->c:[Ljava/lang/Object;

    array-length v2, v1

    sub-int/2addr v2, v5

    aget-object v4, v1, v7

    aput-object v4, v1, v2

    add-int/lit8 v2, p1, 0x1

    invoke-static {v1, v1, v7, v5, v2}, La3/j;->T2([Ljava/lang/Object;[Ljava/lang/Object;III)V

    :goto_1
    iget-object v1, v0, La3/i;->c:[Ljava/lang/Object;

    aput-object v6, v1, p1

    :goto_2
    iget p1, v0, La3/i;->d:I

    sub-int/2addr p1, v5

    iput p1, v0, La3/i;->d:I

    move-object p1, v3

    :goto_3
    return-object p1
.end method

.method public final size()I
    .locals 1

    move-object v0, p0

    check-cast v0, La3/i;

    iget v0, v0, La3/i;->d:I

    return v0
.end method
