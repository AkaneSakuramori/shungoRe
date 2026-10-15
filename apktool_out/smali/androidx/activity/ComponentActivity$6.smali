.class Landroidx/activity/ComponentActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic b:Landroidx/activity/n;


# direct methods
.method public constructor <init>(Landroidx/activity/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/ComponentActivity$6;->b:Landroidx/activity/n;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 1

    sget-object v0, Landroidx/lifecycle/l;->ON_CREATE:Landroidx/lifecycle/l;

    if-ne p2, v0, :cond_0

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p2, v0, :cond_0

    iget-object p2, p0, Landroidx/activity/ComponentActivity$6;->b:Landroidx/activity/n;

    iget-object p2, p2, Landroidx/activity/n;->h:Landroidx/activity/z;

    check-cast p1, Landroidx/activity/n;

    invoke-static {p1}, Landroidx/activity/k;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "invoker"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p2, Landroidx/activity/z;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p1, p2, Landroidx/activity/z;->g:Z

    invoke-virtual {p2, p1}, Landroidx/activity/z;->c(Z)V

    :cond_0
    return-void
.end method
