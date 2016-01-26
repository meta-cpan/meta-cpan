DESCRIPTION = ""Struct::Dumb\" creates record-like structure types, similar to the \
\"struct\" keyword in C, C++ or C\#, or \"Record\" in Pascal. An \
invocation of this module \
will create a construction function which returns new object references \
with \
the given field values. These references all respond to lvalue methods \
that \
access or modify the values stored."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Struct-Dumb"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Struct-Dumb-0.08.tar.gz"

SRC_URI[md5sum] = "dd117142dbee59195ac71b8a40105b80"
SRC_URI[sha256sum] = "e0b72fecfed927286c007bbc3493725bc29a71f4faf4bc04a92caa98cf2a23a7"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Struct-Dumb-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
