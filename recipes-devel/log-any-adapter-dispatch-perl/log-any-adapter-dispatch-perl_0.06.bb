DESCRIPTION = "This Log::Any adapter uses Log::Dispatch for logging."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any-Adapter-Dispatch"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JS/JSWARTZ/Log-Any-Adapter-Dispatch-0.06.tar.gz"

SRC_URI[md5sum] = "0e9ab09ed5d55922bdd6cccd065a4b4a"
SRC_URI[sha256sum] = "baa4c2812f9540b0f0baff810fe46a4e921a411129a4c8ccb09510aef122d89b"
RDEPENDS_${PN} += "log-any-perl"
RDEPENDS_${PN} += "log-dispatch-perl"

S = "${WORKDIR}/Log-Any-Adapter-Dispatch-${PV}"
EXTRA_CPANFLAGS = "--skipdeps"

inherit cpan

BBCLASSEXTEND = "native"
