DESCRIPTION = "Test::Fatal is an alternative to the popular Test::Exception. It does \
much less, but should allow greater flexibility in testing \
exception-throwing \
code with about the same amount of typing."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Fatal"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Fatal-0.014.tar.gz"

SRC_URI[md5sum] = "7954f6d2e3607be10c0fbd69063a3d1b"
SRC_URI[sha256sum] = "bcdcef5c7b2790a187ebca810b0a08221a63256062cfab3c3b98685d91d1cbb0"
RDEPENDS_${PN} += "try-tiny-perl"

S = "${WORKDIR}/Test-Fatal-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
