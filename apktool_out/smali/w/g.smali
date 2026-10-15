.class public final Lw/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw/g;->a:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;)I
    .locals 1

    iget v0, p0, Lw/g;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    sub-int/2addr p1, p2

    return p1

    :pswitch_0
    sget-object v0, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Li0/k0;->m(Landroid/view/View;)F

    move-result p1

    invoke-static {p2}, Li0/k0;->m(Landroid/view/View;)F

    move-result p2

    cmpl-float v0, p1, p2

    if-lez v0, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    cmpg-float p1, p1, p2

    if-gez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    iget v0, p0, Lw/g;->a:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    const-string v0, "a"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v4, 0x4

    :goto_0
    if-ge v4, v0, :cond_2

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v5, v6, :cond_1

    invoke-static {v5, v6}, Lc3/h;->n0(II)I

    move-result p1

    if-gez p1, :cond_0

    :goto_1
    move v1, v2

    goto :goto_2

    :cond_0
    move v1, v3

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-eq p1, p2, :cond_3

    if-ge p1, p2, :cond_0

    goto :goto_1

    :cond_3
    :goto_2
    return v1

    :pswitch_0
    check-cast p2, Ljava/lang/reflect/Constructor;

    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p2

    array-length p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Ljava/lang/reflect/Constructor;

    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    array-length p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    if-ne p2, p1, :cond_4

    goto :goto_3

    :cond_4
    if-nez p2, :cond_5

    move v1, v2

    goto :goto_3

    :cond_5
    if-nez p1, :cond_6

    move v1, v3

    goto :goto_3

    :cond_6
    invoke-virtual {p2, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v1

    :goto_3
    return v1

    :pswitch_1
    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lw/g;->a(Landroid/view/View;Landroid/view/View;)I

    move-result p1

    return p1

    :pswitch_3
    check-cast p1, Ly0/r;

    check-cast p2, Ly0/r;

    iget-object v0, p1, Ly0/r;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_7

    move v4, v3

    goto :goto_4

    :cond_7
    move v4, v1

    :goto_4
    iget-object v5, p2, Ly0/r;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v5, :cond_8

    move v5, v3

    goto :goto_5

    :cond_8
    move v5, v1

    :goto_5
    if-eq v4, v5, :cond_b

    if-nez v0, :cond_a

    :cond_9
    move v1, v3

    goto :goto_7

    :cond_a
    :goto_6
    move v1, v2

    goto :goto_7

    :cond_b
    iget-boolean v0, p1, Ly0/r;->a:Z

    iget-boolean v4, p2, Ly0/r;->a:Z

    if-eq v0, v4, :cond_c

    if-eqz v0, :cond_9

    goto :goto_6

    :cond_c
    iget v0, p2, Ly0/r;->b:I

    iget v2, p1, Ly0/r;->b:I

    sub-int/2addr v0, v2

    if-eqz v0, :cond_d

    move v1, v0

    goto :goto_7

    :cond_d
    iget p1, p1, Ly0/r;->c:I

    iget p2, p2, Ly0/r;->c:I

    sub-int/2addr p1, p2

    if-eqz p1, :cond_e

    move v1, p1

    :cond_e
    :goto_7
    return v1

    :pswitch_4
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lw/g;->a(Landroid/view/View;Landroid/view/View;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
