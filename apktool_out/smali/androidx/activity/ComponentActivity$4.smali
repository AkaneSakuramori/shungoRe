.class Landroidx/activity/ComponentActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# instance fields
.field public final synthetic b:Landroidx/activity/n;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/ComponentActivity$4;->b:Landroidx/activity/n;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V
    .locals 0

    iget-object p1, p0, Landroidx/activity/ComponentActivity$4;->b:Landroidx/activity/n;

    iget-object p2, p1, Landroidx/activity/n;->g:Landroidx/lifecycle/q0;

    if-nez p2, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/activity/l;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/activity/l;->a:Landroidx/lifecycle/q0;

    iput-object p2, p1, Landroidx/activity/n;->g:Landroidx/lifecycle/q0;

    :cond_0
    iget-object p2, p1, Landroidx/activity/n;->g:Landroidx/lifecycle/q0;

    if-nez p2, :cond_1

    new-instance p2, Landroidx/lifecycle/q0;

    invoke-direct {p2}, Landroidx/lifecycle/q0;-><init>()V

    iput-object p2, p1, Landroidx/activity/n;->g:Landroidx/lifecycle/q0;

    :cond_1
    iget-object p1, p1, Landroidx/activity/n;->e:Landroidx/lifecycle/t;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/q;)V

    return-void
.end method
