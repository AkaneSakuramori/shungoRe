.class public final Landroidx/activity/r;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/l;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Landroidx/activity/z;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/z;I)V
    .locals 0

    iput p2, p0, Landroidx/activity/r;->c:I

    iput-object p1, p0, Landroidx/activity/r;->d:Landroidx/activity/z;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/activity/b;)V
    .locals 4

    iget v0, p0, Landroidx/activity/r;->c:I

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/activity/r;->d:Landroidx/activity/z;

    const-string v3, "backEvent"

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v2, Landroidx/activity/z;->b:La3/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, La3/i;->d:I

    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/c0;

    iget-boolean v2, v2, Landroidx/fragment/app/c0;->a:Z

    if-eqz v2, :cond_0

    move-object v1, v0

    :cond_1
    check-cast v1, Landroidx/fragment/app/c0;

    return-void

    :pswitch_0
    invoke-static {p1, v3}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v2, Landroidx/activity/z;->b:La3/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, La3/i;->d:I

    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroidx/fragment/app/c0;

    iget-boolean v3, v3, Landroidx/fragment/app/c0;->a:Z

    if-eqz v3, :cond_2

    move-object v1, v0

    :cond_3
    check-cast v1, Landroidx/fragment/app/c0;

    iput-object v1, v2, Landroidx/activity/z;->c:Landroidx/fragment/app/c0;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lz2/f;->a:Lz2/f;

    iget v1, p0, Landroidx/activity/r;->c:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Landroidx/activity/b;

    invoke-virtual {p0, p1}, Landroidx/activity/r;->b(Landroidx/activity/b;)V

    return-object v0

    :pswitch_0
    check-cast p1, Landroidx/activity/b;

    invoke-virtual {p0, p1}, Landroidx/activity/r;->b(Landroidx/activity/b;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
