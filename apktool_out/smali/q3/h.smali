.class public final Lq3/h;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/l;


# static fields
.field public static final c:Lq3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq3/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk3/g;-><init>(I)V

    sput-object v0, Lq3/h;->c:Lq3/h;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "line"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
