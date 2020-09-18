DESCRIPTION = "Method modifiers are a convenient feature from the CLOS (Common Lisp Object \
System) world."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Method-Modifiers"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Class-Method-Modifiers-2.13.tar.gz"

SRC_URI[md5sum] = "b1398e3682aa2e075b913b9f9000b596"
SRC_URI[sha256sum] = "ab5807f71018a842de6b7a4826d6c1f24b8d5b09fcce5005a3309cf6ea40fd63"
DEPENDS += "test-needs-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Class-Method-Modifiers-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
