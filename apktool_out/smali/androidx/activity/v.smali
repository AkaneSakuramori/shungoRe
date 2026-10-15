.class public final Landroidx/activity/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lj3/l;

.field public final synthetic b:Lj3/l;

.field public final synthetic c:Lj3/a;

.field public final synthetic d:Lj3/a;


# direct methods
.method public constructor <init>(Lj3/l;Lj3/l;Lj3/a;Lj3/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/v;->a:Lj3/l;

    iput-object p2, p0, Landroidx/activity/v;->b:Lj3/l;

    iput-object p3, p0, Landroidx/activity/v;->c:Lj3/a;

    iput-object p4, p0, Landroidx/activity/v;->d:Lj3/a;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/v;->d:Lj3/a;

    invoke-interface {v0}, Lj3/a;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Landroidx/activity/v;->c:Lj3/a;

    invoke-interface {v0}, Lj3/a;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/v;->b:Lj3/l;

    new-instance v1, Landroidx/activity/b;

    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lj3/l;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/v;->a:Lj3/l;

    new-instance v1, Landroidx/activity/b;

    invoke-direct {v1, p1}, Landroidx/activity/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lj3/l;->e(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
