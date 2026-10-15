.class public final synthetic Ll2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ll2/g;

.field public final synthetic d:Lm/f;

.field public final synthetic e:Ljava/lang/Runnable;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll2/g;Lm/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ll2/d;->b:I

    iput-object p1, p0, Ll2/d;->c:Ll2/g;

    iput-object p2, p0, Ll2/d;->d:Lm/f;

    const/4 p1, 0x0

    iput-object p1, p0, Ll2/d;->f:Ljava/lang/Object;

    iput-object p1, p0, Ll2/d;->e:Ljava/lang/Runnable;

    return-void
.end method

.method public synthetic constructor <init>(Ll2/g;Lm/f;I)V
    .locals 1

    .line 2
    sget-object p3, Ll2/g;->i:Li2/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ll2/d;->b:I

    iput-object p1, p0, Ll2/d;->c:Ll2/g;

    iput-object p3, p0, Ll2/d;->f:Ljava/lang/Object;

    iput-object p2, p0, Ll2/d;->d:Lm/f;

    const/4 p1, 0x0

    iput-object p1, p0, Ll2/d;->e:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Ll2/d;->b:I

    iget-object v1, p0, Ll2/d;->e:Ljava/lang/Runnable;

    iget-object v2, p0, Ll2/d;->d:Lm/f;

    iget-object v3, p0, Ll2/d;->c:Ll2/g;

    iget-object v4, p0, Ll2/d;->f:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Ll2/e;

    iget-object v0, v3, Ll2/g;->a:Landroid/content/Context;

    iget-object v3, v3, Ll2/g;->b:Ljava/lang/String;

    check-cast v4, Li2/w;

    invoke-virtual {v4, v0, v2, v3, v1}, Li2/w;->a(Landroid/content/Context;Lm/f;Ljava/lang/String;Ljava/lang/Runnable;)V

    return-void

    :pswitch_0
    invoke-static {v4}, La;->n(Ljava/lang/Object;)V

    iget-object v0, v3, Ll2/g;->f:Ll/e;

    if-eqz v0, :cond_0

    invoke-virtual {v3, v2, v1}, Ll2/g;->b(Lm/f;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "mSession is null in launchWhenSessionEstablished"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
