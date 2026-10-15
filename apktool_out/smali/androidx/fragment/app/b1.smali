.class public final Landroidx/fragment/app/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroidx/fragment/app/c1;

.field public final synthetic d:Landroidx/fragment/app/d1;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/d1;Landroidx/fragment/app/c1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Landroidx/fragment/app/b1;->b:I

    iput-object p1, p0, Landroidx/fragment/app/b1;->d:Landroidx/fragment/app/d1;

    iput-object p2, p0, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/c1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Landroidx/fragment/app/b1;->b:I

    iget-object v1, p0, Landroidx/fragment/app/b1;->c:Landroidx/fragment/app/c1;

    iget-object v2, p0, Landroidx/fragment/app/b1;->d:Landroidx/fragment/app/d1;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, Landroidx/fragment/app/d1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v2, Landroidx/fragment/app/d1;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, v2, Landroidx/fragment/app/d1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, v1, Landroidx/fragment/app/c1;->a:I

    iget-object v1, v1, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget-object v1, v1, Landroidx/fragment/app/q;->F:Landroid/view/View;

    invoke-static {v0, v1}, La;->a(ILandroid/view/View;)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
