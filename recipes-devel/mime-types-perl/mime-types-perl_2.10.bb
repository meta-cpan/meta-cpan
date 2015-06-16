DESCRIPTION = "MIME types are used in many applications (for instance as part of \
e-mail and HTTP traffic) to indicate the type of content which is transmitted or \
expected. See RFC2045 at https://www.ietf.org/rfc/rfc2045.txt"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Types"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MARKOV/MIME-Types-2.10.tar.gz"

SRC_URI[md5sum] = "640d6a1f83a6513946fb9a856e40bc1e"
SRC_URI[sha256sum] = "a0e235f28382cec414ef4d0a95b4d40e2a359ce23184600a1ab6313feb267b05"

S = "${WORKDIR}/MIME-Types-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
