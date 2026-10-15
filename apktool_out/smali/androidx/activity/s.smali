.class public final Landroidx/activity/s;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/a;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Landroidx/activity/z;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/z;I)V
    .locals 0

    iput p2, p0, Landroidx/activity/s;->c:I

    iput-object p1, p0, Landroidx/activity/s;->d:Landroidx/activity/z;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lz2/f;->a:Lz2/f;

    iget v1, p0, Landroidx/activity/s;->c:I

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p0}, Landroidx/activity/s;->b()V

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Landroidx/activity/s;->b()V

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Landroidx/activity/s;->b()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 5

    iget v0, p0, Landroidx/activity/s;->c:I

    iget-object v1, p0, Landroidx/activity/s;->d:Landroidx/activity/z;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Landroidx/activity/z;->b()V

    return-void

    :pswitch_0
    iget-object v0, v1, Landroidx/activity/z;->b:La3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v0, La3/i;->d:I

    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroidx/fragment/app/c0;

    iget-boolean v4, v4, Landroidx/fragment/app/c0;->a:Z

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    check-cast v2, Landroidx/fragment/app/c0;

    iput-object v3, v1, Landroidx/activity/z;->c:Landroidx/fragment/app/c0;

    return-void

    :pswitch_1
    invoke-virtual {v1}, Landroidx/activity/z;->b()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
