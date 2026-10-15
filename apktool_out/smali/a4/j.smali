.class public abstract La4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La4/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La4/j;->a:La4/i;

    return-void
.end method


# virtual methods
.method public a(La4/t;La4/g0;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public abstract b(La4/b0;)V
.end method
