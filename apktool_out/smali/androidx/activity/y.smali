.class public final synthetic Landroidx/activity/y;
.super Lk3/f;
.source "SourceFile"

# interfaces
.implements Lj3/a;


# instance fields
.field public final synthetic j:I


# direct methods
.method public constructor <init>(ILandroidx/activity/z;)V
    .locals 1

    iput p1, p0, Landroidx/activity/y;->j:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0, p2}, Lk3/f;-><init>(Landroidx/activity/z;)V

    return-void

    :cond_0
    invoke-direct {p0, p2}, Lk3/f;-><init>(Landroidx/activity/z;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    sget-object v0, Lz2/f;->a:Lz2/f;

    iget-object v1, p0, Lk3/a;->c:Ljava/lang/Object;

    iget v2, p0, Landroidx/activity/y;->j:I

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    check-cast v1, Landroidx/activity/z;

    invoke-virtual {v1}, Landroidx/activity/z;->d()V

    goto :goto_0

    :pswitch_0
    check-cast v1, Landroidx/activity/z;

    invoke-virtual {v1}, Landroidx/activity/z;->d()V

    :goto_0
    return-object v0

    :pswitch_1
    packed-switch v2, :pswitch_data_2

    check-cast v1, Landroidx/activity/z;

    invoke-virtual {v1}, Landroidx/activity/z;->d()V

    goto :goto_1

    :pswitch_2
    check-cast v1, Landroidx/activity/z;

    invoke-virtual {v1}, Landroidx/activity/z;->d()V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
